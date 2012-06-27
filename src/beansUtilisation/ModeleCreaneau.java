package beansUtilisation;

import java.util.ArrayList;

import beans.EC;
import beans.Enseignant;
import beans.Salle;
import dao.DAO;
import dao.ECDAO;
import dao.EnseignantDAO;
import dao.SalleDAO;

public class ModeleCreaneau {
	
	
	public boolean creation(int idEns, int idSalle, int idEc){
		boolean result=false;
		
		
		return result;
	}
	
	public boolean modification(int idEns, int idSalle, int idEc){
		boolean result=false;
		
		
		return result;
	}
	
	
	public boolean suppression(int idEns, int idSalle, int idEc){
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
