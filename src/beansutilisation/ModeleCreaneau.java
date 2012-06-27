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
		return (ArrayList<Enseignant>) daoEns.findAll();
	}
	public static ArrayList<Salle> getAllSalle(){
		
		SalleDAO daoSalle= new SalleDAO(); 
		return (ArrayList<Salle>) daoSalle.findAll();
	}
	
	public static ArrayList<EC> getAllEC(){
		
		ECDAO daoEc= new ECDAO(); 
		return (ArrayList<EC>) daoEc.findAll();
	}
	
	
	

}
