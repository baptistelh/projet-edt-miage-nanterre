package beansutilisation;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import beans.Creneau;
import beans.EC;
import beans.Enseignant;
import beans.Jours;
import beans.Promotion;
import beans.Salle;
import beans.Type;
import dao.CreneauDAO;
import dao.DAO;
import dao.ECDAO;
import dao.EnseignantDAO;
import dao.JoursDAO;
import dao.PromotionDAO;
import dao.SalleDAO;
import dao.TypeDAO;

public class ModeleCreneau {
	
	
	public static void creation(int idEns, int idSalle, int idEc, int typearg,int idPromo, String date, String horaire, String duree){
		
		
		EnseignantDAO ensDAO = new EnseignantDAO();
		Enseignant ens=ensDAO.find(idEns);
		
		SalleDAO salleDAO = new SalleDAO();
		Salle salle=salleDAO.find(idSalle);
		
		ECDAO EcDAO = new ECDAO();
		EC ec=EcDAO.find(idEc);
		
		TypeDAO typeDAO=new TypeDAO();
		Type type =typeDAO.find(typearg);
		
		PromotionDAO promDAO = new PromotionDAO();
		Promotion prom= promDAO.find(idPromo);
		
		int d=Integer.parseInt( date.substring(0,2));
		int m=Integer.parseInt( date.substring(3,5));
		int y=Integer.parseInt( date.substring(6));
		GregorianCalendar gcDate = new GregorianCalendar(y, m, d);
		
		JoursDAO jourDAO=new JoursDAO();
		Jours jour =jourDAO.find(gcDate);
		
		int dureInt= Integer.parseInt(duree);
		
		//Creation d'un bean creneau selon les arguments reçus
		Creneau newCreneau = new Creneau(ens, salle,ec,type,jour, horaire, dureInt);
		ArrayList<Creneau> newCreneaux = new ArrayList<Creneau>();
		newCreneaux.add(newCreneau);
		
		try{
			EnseignantEDT.TestEnseignant(newCreneaux, ens);
			VerificationPromoSalle.verifSalle(newCreneaux, salle);
			VerificationPromoSalle.verifPromo(newCreneaux, prom);
			VerificationEC.verificationTempsEC(ec, type);
		}catch(VerificationException e){
			e.printStackTrace();
		}
		
		//création du créneau
		CreneauDAO creDao= new CreneauDAO();
		creDao.create(newCreneau);
		
		//update de l'enseignant - PEUT ETRE A ENLEVER CAR PAS DE CHANGEMENT NORMALEMENT
		ArrayList<Creneau> newCreneauxEns = new ArrayList<Creneau>();
		newCreneauxEns.addAll(ens.getMesCreneaux());
		newCreneauxEns.addAll(newCreneaux);
		ens.setMesCreneaux(newCreneauxEns);
		ensDAO.update(ens);
		
	
		
		//update de la salle PEUT ETRE A ENLEVER CAR PAS DE CHANGEMENT NORMALEMENT
		ArrayList<Creneau> newCreneauxsalle = new ArrayList<Creneau>();
		newCreneauxsalle.addAll(salle.getMesCreneaux());
		newCreneauxsalle.addAll(newCreneaux);
		salle.setMesCreneaux(newCreneauxsalle);
		salleDAO.update(salle);
		
		
		
		
	}
	
	public boolean modification(int idEns, int idSalle, int idEc, int typearg,int idPromo, String date, String horaire, String duree){
		boolean result=false;
		
		
		return result;
	}
	
	
	public boolean suppression(int idEns, int idSalle, int idEc, int typearg,String date){
		boolean result=false;
		
		
		return result;
	}

	
	public static ArrayList<Enseignant> getAllEnseignants(){
		
		EnseignantDAO DAOens= new EnseignantDAO(); 
		ArrayList<Enseignant> ens= (ArrayList<Enseignant>) DAOens.findAll();
		return ens;
	}
	public static ArrayList<Salle> getAllSalle(){
		
		SalleDAO DAOsalle= new SalleDAO(); 
		ArrayList<Salle> salles= (ArrayList<Salle>) DAOsalle.findAll();
		return salles;
	}
	
	public static ArrayList<EC> getAllEC(){
		
		ECDAO DAOEC= new ECDAO(); 
		ArrayList<EC> ecs= (ArrayList<EC>) DAOEC.findAll();
		return ecs;
	}
	
	
	

}
