package beansutilisation;

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
		
		EnseignantDAO daoEns= new EnseignantDAO(); 
		ArrayList<Enseignant> ens= (ArrayList<Enseignant>) daoEns.findAll();
		return ens;
	}
	public static ArrayList<Salle> getAllSalle(){
		
		SalleDAO daoSalle= new SalleDAO(); 
		ArrayList<Salle> salles= (ArrayList<Salle>) daoSalle.findAll();
		return salles;
	}
	
	public static ArrayList<EC> getAllEC(){
		
		ECDAO daoEc= new ECDAO(); 
		ArrayList<EC> ecs= (ArrayList<EC>) daoEc.findAll();
		return ecs;
	}
	
	
	

}
