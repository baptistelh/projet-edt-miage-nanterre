//package dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//import beans.Creneau;
//import beans.Salle;
//
//public class SalleDAO extends DAO<Salle> {
//
//	public static String TABLE = "SALLE";
//
//	public static boolean debug = true;
//
//	@Override
//	public Salle create(Salle obj) {
//
//		try {
//			Statement request = this.connect.createStatement();
//			String requete = "INSERT INTO " + SalleDAO.TABLE + " (NO_SALLE, "
//					+ "CAPACITE_SALLE, " + "LIEU_SALLE) " + "VALUES (" + "'"
//					+ obj.getNumeroSalle() + "'," + obj.getCapacite() + ","
//					+ "'" + obj.getLieu() + "')";
//
//			request.executeUpdate(requete);
//
//			if (debug)
//				System.out.println(requete);
//
//			request.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return obj;
//
//	}
//
//	@Override
//	public void delete(Salle obj) {
//		try {
//			Statement request = this.connect.createStatement();
//			String requete = "DELETE FROM " + SalleDAO.TABLE
//					+ " WHERE NO_SALLE = '" + obj.getNumeroSalle() + "'";
//			request.executeUpdate(requete);
//
//			request.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public List<Salle> findAll() {
//		List<Salle> listeSalle = new ArrayList<Salle>();
//		Salle obj = null;
//		try {
//			Statement request = this.connect.createStatement(
//					ResultSet.TYPE_SCROLL_INSENSITIVE,
//					ResultSet.CONCUR_UPDATABLE);
//			ResultSet result = request.executeQuery("SELECT * FROM "
//					+ CreneauDAO.TABLE);
//
//			while (result.next()) {
//				obj = new Salle(result.getString("NO_SALLE"),
//						result.getInt("CAPACITE_SALLE"),
//						result.getString("LIEU_SALLE"));
//
//				listeSalle.add(obj);
//
//			}
//			request.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return listeSalle;
//	}
//
//	@Override
//	public Salle update(Salle obj) {
//		try {
//			Statement request = this.connect.createStatement();
//			String requete = "UPDATE " + SalleDAO.TABLE
//					+ " SET CAPACITE_SALLE = " + obj.getCapacite() + ", "
//					+ "LIEU_SALLE = '" + obj.getLieu() + "'"
//					+ " WHERE NO_SALLE = '" + obj.getNumeroSalle() + "'";
//			request.executeUpdate(requete);
//
//			request.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}
//
//	
//	
//	public Salle find(String no_salle) {
//		Salle obj = null;
//		try {
//			Statement request = this.connect.createStatement(
//					ResultSet.TYPE_SCROLL_INSENSITIVE,
//					ResultSet.CONCUR_UPDATABLE);
//			String requete = "SELECT * FROM "
//					+ CreneauDAO.TABLE + " WHERE NO_SALLE = '" + no_salle + "'";
//			if(debug) System.out.println(requete);
//			ResultSet result = request.executeQuery(requete);
//			
//			obj = new Salle(result.getString("NO_SALLE"),
//					result.getInt("CAPACITE_SALLE"),
//					result.getString("LIEU_SALLE"));
//			
//			request.close();			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return obj;
//	}
//
//	@Override
//	public Salle find(int arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	public void loadMesCreneaux(Salle obj) {
//		String no_salle = obj.getNumeroSalle();
//		try {
//			Statement request = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			ResultSet result = request.executeQuery("SELECT * FROM " + CreneauDAO.TABLE + " WHERE NO_SALLE = '" + no_salle + "'");
//
//			while(result.next()){
//				CreneauDAO c = new CreneauDAO();
//				Creneau creneau= c.find(result.getInt("NO_ENSEIGNANT"), 
//						result.getString("NO_SALLE"), 
//						result.getInt("NO_EC"), 
//						result.getInt("NO_UE"), 
//						result.getInt("NO_FORMATION"), 
//						result.getInt("NO_TYPE"), 
//						DAO.dateFromOracleToJava(result.getDate("DATE_CRENEAU")));
//				
//				obj.getMesCreneaux().add(creneau);
//			}
//	    } catch (SQLException e) {
//	            e.printStackTrace();
//	    }
//	}
//	
//	public void loadMesReunions(Salle obj) {
//		String no_salle = obj.getNumeroSalle();
//		try {
//			Statement request = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			ResultSet result = request.executeQuery("SELECT * FROM " + ReunionDAO.TABLE + " WHERE NO_SALLE = " + no_salle);
//
//			while(result.next()){
//				ReunionDAO r = new ReunionDAO();
//				Reunion reunion= r.find(result.getInt("NO_REUNION"));
//				
//				obj.getMesReunions().add(reunion);
//			}
//	    } catch (SQLException e) {
//	            e.printStackTrace();
//	    }
//	}
//
//}