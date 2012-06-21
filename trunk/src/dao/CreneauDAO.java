package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import beans.Creneau;
import beans.Enseignant;
import beans.Salle;

public class CreneauDAO extends DAO<Creneau> {

	public static String TABLE = "CRENEAU";

	public static boolean debug = true;

	public List<Creneau> findAll() {
		List<Creneau> listeCreneaux = new ArrayList<Creneau>();
		Creneau obj = null;
		try {
			Statement request = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM "
					+ CreneauDAO.TABLE);

			while (result.next()) {

				EnseignantDAO enseignantDAO = new EnseignantDAO();
				SalleDAO salleDAO = new SalleDAO();
				ECDAO ecDAO = new ECDAO();
				TypeDAO typeDAO = new TypeDAO();
				JoursDAO joursDAO = new JoursDAO();

				obj = new Creneau();
				obj.setMonEnseignant(enseignantDAO.find(result
						.getInt("NO_ENSEIGNANT")));
				obj.setMaSalle(salleDAO.find(result.getInt("NO_SALLE")));
				obj.setMonEC(ecDAO.find(result.getInt("NO_EC"),
						result.getInt("NO_UE"), result.getInt("NO_FORMATION")));
				obj.setMonType(typeDAO.find(result.getInt("NO_TYPE")));
				obj.setDateCreneau(joursDAO.find(DAO
						.dateFromOracleToJava(result.getDate("DATE_CRENEAU"))));
				obj.setDuree(result.getInt("DUREE_CRENEAU"));
				obj.setHoraire(result.getString("DUREE_CRENEAU"));

				listeCreneaux.add(obj);

			}
			request.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeCreneaux;
	}

	@Override
	public Creneau create(Creneau obj) {

		try {
			Statement request = this.connect.createStatement();
			String requete = "INSERT INTO "
					+ FormationDAO.TABLE
					+ " (NO_ENSEIGNANT, "
					+ "NO_SALLE, "
					+ "NO_EC, "
					+ "NO_UE, "
					+ "NO_FORMATION, "
					+ "NO_TYPE, "
					+ "DATE_CRENEAU, "
					+ "HORAIRE_CRENEAU, "
					+ "DUREE_CRENEAU) "
					+ "VALUES ("
					+ obj.getMonEnseignant().getNumeroEnseignant()
					+ ","
					+ "'"
					+ obj.getMaSalle().getNumeroSalle()
					+ "',"
					+ obj.getMonEC().getNumeroEC()
					+ ","
					+ obj.getMonEC().getMonUE().getNumeroUE()
					+ ","
					+ obj.getMonEC().getMonUE().getMaFormation()
							.getNumeroFormation()
					+ ","
					+ obj.getMonType().getNumeroType()
					+ ",'"
					+ DAO.dateFromJavaToOracle(obj.getDateCreneau()
							.getDateDuJour()) + "'," + "'" + obj.getHoraire()
					+ "'," + obj.getDuree() + ")";

			request.executeUpdate(requete);

			if (debug)
				System.out.println(requete);

			request.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;

	}

	@Override
	public Creneau update(Creneau obj) {

		delete(obj);
		create(obj);

		return obj;
	}

	@Override
	public void delete(Creneau obj) {
		try {
			Statement request = this.connect.createStatement();
			String requete = "DELETE FROM "
					+ CreneauDAO.TABLE
					+ " WHERE NO_ENSEIGNANT = "
					+ obj.getMonEnseignant().getNumeroEnseignant()
					+ " AND   NO_SALLE = '"
					+ obj.getMaSalle().getNumeroSalle()
					+ "'"
					+ " AND   NO_EC = "
					+ obj.getMonEC().getNumeroEC()
					+ " AND   NO_UE = "
					+ obj.getMonEC().getMonUE().getNumeroUE()
					+ " AND   NO_FORMATION = "
					+ obj.getMonEC().getMonUE().getMaFormation()
							.getNumeroFormation()
					+ " AND   NO_TYPE = "
					+ obj.getMonType().getNumeroType()
					+ " AND   DATE_CRENEAU = "
					+ DAO.dateFromJavaToOracle(obj.getDateCreneau()
							.getDateDuJour());
			request.executeUpdate(requete);

			request.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Creneau find(int no_enseignant, String no_salle, int no_ec,
			int no_ue, int no_formation, int no_type,
			GregorianCalendar date_creneau) {

		Creneau obj = null;
		try {
			Statement request = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			String requete = "SELECT * FROM " + CreneauDAO.TABLE
					+ " WHERE NO_ENSEIGNANT = " + no_enseignant
					+ " AND   NO_SALLE = '" + no_salle + "'"
					+ " AND   NO_EC = " + no_ec + " AND   NO_UE = " + no_ue
					+ " AND   NO_FORMATION = " + no_formation
					+ " AND   NO_TYPE = " + no_type + " AND   DATE_CRENEAU = "
					+ DAO.dateFromJavaToOracle(date_creneau);
			System.out.println(request);
			ResultSet result = request.executeQuery(requete);

			EnseignantDAO enseignantDAO = new EnseignantDAO();
			SalleDAO salleDAO = new SalleDAO();
			ECDAO ecDAO = new ECDAO();
			TypeDAO typeDAO = new TypeDAO();
			JoursDAO joursDAO = new JoursDAO();

			obj = new Creneau();
			obj.setMonEnseignant(enseignantDAO.find(result
					.getInt("NO_ENSEIGNANT")));
			obj.setMaSalle(salleDAO.find(result.getInt("NO_SALLE")));
			obj.setMonEC(ecDAO.find(result.getInt("NO_EC"),
					result.getInt("NO_UE"), result.getInt("NO_FORMATION")));
			obj.setMonType(typeDAO.find(result.getInt("NO_TYPE")));
			obj.setDateCreneau(joursDAO.find(DAO.dateFromOracleToJava(result
					.getDate("DATE_CRENEAU"))));
			obj.setDuree(result.getInt("DUREE_CRENEAU"));
			obj.setHoraire(result.getString("DUREE_CRENEAU"));

			request.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Creneau find(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
