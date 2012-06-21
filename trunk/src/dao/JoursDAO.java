package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.*;



public class JoursDAO extends DAO<Jours> {
	
	public static String TABLE = "JOURS";
	
	public static boolean debug = true;
	
	public List<Jours> findAll() {
		List <Creneau> listeCreneaux= new ArrayList<Creneau>();
		Creneau obj = null;
		try {
			Statement request = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM " + JoursDAO.TABLE);

			while (result.next()){
				
				EnseignantDAO enseignantDAO= new EnseignantDAO();
				SalleDAO salleDAO= new SalleDAO();
				ECDAO ecDAO= new ECDAO();
				TypeDAO typeDAO= new TypeDAO();
				JoursDAO joursDAO= new JoursDAO();
				

				obj = new Creneau();
				obj.setMonEnseignant(enseignantDAO.find(result.getInt("NO_ENSEIGNANT")));
				obj.setMaSalle(salleDAO.find(result.getInt("NO_SALLE")));
				obj.setMonEC(ecDAO.find(result.getInt("NO_EC"), result.getInt("NO_UE"), result.getInt("NO_FORMATION")));
				obj.setMonType(typeDAO.find(result.getInt("NO_TYPE")));
				obj.setDateCreneau(joursDAO.find(result.getDate("DATE_CRENEAU")));
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
	public Jours create(Jours obj) {
			try {
					Statement request = this.connect.createStatement();
					String requete = "INSERT INTO "+ FormationDAO.TABLE+" (NO_ENSEIGNANT, " +
												                            "NO_SALLE, " +
												                            "NO_EC, " +
												                            "NO_UE, " +
												                            "NO_FORMATION, " +
												                            "NO_TYPE, " +
												                            "DATE_CRENEAU, " +
												                            "HORAIRE_CRENEAU, " +
												                            "DUREE_CRENEAU) " +
										"VALUES ("+
												                            obj.getMonEnseignant().getNumeroEnseignant() +","
												                    + "'" + obj.getMaSalle().getNumeroSalle() +"',"
												                          + obj.getMonEC().getNumeroEC()+","
												                          + obj.getMonEC().getMonUE().getNumeroUE()+","
												                          + obj.getMonEC().getMonUE().getMaFormation().getNumeroFormation()+","
												                          + obj.getMonType().getNumeroType()+",'"
												                          + DAO.dateFromJavaToOracle(obj.getDateCreneau().getDateDuJour()) +"',"
												                    + "'" + obj.getHoraire() +"',"
												                          + obj.getDuree() + ")";
					
						request.executeUpdate(requete);
					
					if(debug) System.out.println(requete);		                                                 
				
					request.close();
				/*	if(!obj.getMesUE().isEmpty()){
						for(int i=0;i<obj.getMesUE().size();i++){				
							UEDAO ueDAO = new UEDAO();
							if(ueDAO.find(obj.getMesUE().get(i).getNumeroUE()) ==null){
								ueDAO.create(obj.getMesUE().get(i));
							}
							else{
								//on met a jour
							}
						}
					}*/
				/*	if(!obj.getMesPromotions().isEmpty()){
						for(int i=0;i<obj.getMesPromotions().size();i++){				
							PromotionDAO promoDAO = new PromotionDAO();
							if(promoDAO.find(obj.getMesPromotions().get(i).getNumeroPromotion()) ==null){
								promoDAO.create(obj.getMesPromotions().get(i));
							}
							else{
								//on met a jour
							}
						}
					}*/
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
				String requete = "DELETE FROM " + CreneauDAO.TABLE +" WHERE NO_ENSEIGNANT = " + obj.getMonEnseignant().getNumeroEnseignant() +
		                        " AND   NO_SALLE = " +  obj.getMaSalle().getNumeroSalle() +
		                        " AND   NO_EC = " + obj.getMonEC().getNumeroEC() +
		                        " AND   NO_UE = " + obj.getMonEC().getMonUE().getNumeroUE() +
		                        " AND   NO_FORMATION = " + obj.getMonEC().getMonUE().getMaFormation().getNumeroFormation() +
		                        " AND   NO_TYPE = " + obj.getMonType().getNumeroType() +
		                        " AND   DATE_CRENEAU = " + DAO.dateFromJavaToOracle(obj.getDateCreneau().getDateDuJour()) + ";";
				request.executeUpdate(requete);
				
				request.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public void loadMesUE(Formation obj) {
		int id = obj.getNumeroFormation();
		try {
			Statement request = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM " + UEDAO.TABLE + " WHERE NO_FORMATION = " + id);

			while(result.next()){
				UE ue = new UE(result.getInt("NO_UE"), obj);
				obj.getMesUE().add(ue);
			}
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	}
	
	public void loadMesPromotions(Creneau obj) {
		int id = obj.getNumeroFormation();
		try {
			Statement request = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result = request.executeQuery("SELECT * FROM " + PromotionDAO.TABLE + " WHERE NO_FORMATION = " + id);

			while(result.next()){
				Promotion p = new Promotion(result.getInt("NO_PROMOTION"));
				obj.getMesPromotions().add(p);
			}
	    } catch (SQLException e) {
	            e.printStackTrace();
	    }
	}

}
