package daoEdt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Creneau;
import beans.Periode;
import beans.Salle;
import beans.Semestre;
import beans.UE;

public class SemestreDAO extends DAO<Semestre> {
	
	public static String TABLE = "SEMESTRE";

	public static boolean debug = true;

	@Override
	public Semestre create(Semestre obj) {
		try {
			Statement request = this.connect.createStatement();
			String requete = "INSERT INTO " + SemestreDAO.TABLE + 
								" (NO_SEMESTRE, "
								+ "LIBELLE_SEMESTRE) " 
						+ "VALUES (" 
					            + obj.getNumeroSemestre()+ ","
						  + "'" + obj.getLibelle() + "')";

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
	public void delete(Semestre obj) {
		try {
			Statement request = this.connect.createStatement();
			String requete = "DELETE FROM " + SemestreDAO.TABLE
						+ " WHERE NO_SEMESTRE = "
				  + "'" + obj.getLibelle() + "')";
			request.executeUpdate(requete);
			request.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Semestre find(int no_semestre) {
		Semestre obj = null;
		try {
			Statement request = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			String requete = "SELECT * FROM "
					+ SemestreDAO.TABLE + " WHERE NO_SEMESTRE = '" + no_semestre + "'";
			if(debug) System.out.println(requete);
			ResultSet result = request.executeQuery(requete);
			
			obj = new Semestre(result.getInt("NO_SEMESTRE"),
						result.getString("LIBELLE_SEMESTRE"));
			
			request.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public List<Semestre> findAll() {
		List<Semestre> listeSemestre = new ArrayList<Semestre>();
		Semestre obj = null;
		try {
			Statement request = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM "
					+ SemestreDAO.TABLE);

			while (result.next()) {
				obj = new Semestre(result.getInt("NO_SEMESTRE"),
						result.getString("LIBELLE_SEMESTRE"));

				listeSemestre.add(obj);

			}
			request.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeSemestre;
	}

	@Override
	public Semestre update(Semestre obj) {
		try {
			Statement request = this.connect.createStatement();
			String requete = "UPDATE " + SemestreDAO.TABLE
					+ " SET LIBELLE_SEMESTRE = " + obj.getLibelle()
					+ " WHERE NO_SEMESTRE = '" + obj.getNumeroSemestre() + "'";
			request.executeUpdate(requete);

			request.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public void loadMesUE(Semestre obj) {
		int no_semestre = obj.getNumeroSemestre();
		try {
			Statement request = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM " + UEDAO.TABLE + " WHERE NO_SEMESTRE = " + no_semestre);

			while(result.next()){
				UEDAO c = new UEDAO();
				UE ue = c.find(result.getInt("NO_UE"), result.getInt("NO_FORMATION"));
				
				obj.getMesUE().add(ue);
			}
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	}
	
	public void loadMesPeriode(Semestre obj) {
		int no_semestre = obj.getNumeroSemestre();
		try {
			Statement request = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM " + PeriodeDAO.TABLE + " WHERE NO_SEMESTRE = " + no_semestre);

			while(result.next()){
				PeriodeDAO c = new PeriodeDAO();
				Periode periode = c.find(result.getInt("NO_PERIODES"));
				
				obj.getMesPeriodes().add(periode);
			}
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	}

}
