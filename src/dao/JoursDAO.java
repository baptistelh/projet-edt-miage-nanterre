package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import beans.*;

public class JoursDAO extends DAO<Jours> {

	public static String TABLE = "JOURS";

	public static boolean debug = true;

	public List<Jours> findAll() {
		List<Jours> listeJours = new ArrayList<Jours>();
		Jours obj = null;
		try {
			Statement request = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM "
					+ JoursDAO.TABLE);

			while (result.next()) {
				obj = new Jours();
				obj.setDateDuJour(DAO.dateFromOracleToJava(result
						.getDate("DATE_JOUR")));
				listeJours.add(obj);
			}
			request.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeJours;
	}

	@Override
	public Jours create(Jours obj) {
		try {
			Statement request = this.connect.createStatement();
			String requete = "INSERT INTO " + FormationDAO.TABLE
					+ " (DATE_JOUR)" + "VALUES ("
					+ DAO.dateFromJavaToOracle(obj.getDateDuJour()) + ")";
			request.executeUpdate(requete);
			if (debug)
				System.out.println(requete);
			request.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Jours update(Jours obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Jours obj) {
		try {
			Statement request = this.connect.createStatement();
			String requete = "DELETE FROM " + CreneauDAO.TABLE
					+ " WHERE DATE_JOUR = "
					+ DAO.dateFromJavaToOracle(obj.getDateDuJour()) + ";";
			request.executeUpdate(requete);
			request.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Jours find(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Jours find(GregorianCalendar date) {
		Jours j = new Jours();
		try {

			Statement request = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM "
					+ JoursDAO.TABLE + "WHERE DATE_JOUR = "
					+ DAO.dateFromJavaToOracle(date) + ";");

			j = new Jours(DAO.dateFromOracleToJava(result.getDate("DATE_JOUR")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return j;
	}
}
