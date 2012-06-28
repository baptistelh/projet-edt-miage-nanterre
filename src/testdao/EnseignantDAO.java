package testdao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import beans.*;

public class EnseignantDAO {
	
	private static List<Enseignant> list = new ArrayList<Enseignant>();
	
	
	public Enseignant find(int id) {
		for(Enseignant e : EnseignantDAO.list) {
			if(e.getNumeroEnseignant() == id) {
				return e;
			}
		}
		return null;
	}

	public List<Enseignant> findAll() {
		return EnseignantDAO.list;
	}
	
	public Enseignant create(Enseignant obj) {
		EnseignantDAO.list.add(obj);
		return obj;
	}
	
	public Enseignant update(Enseignant obj) {
		for(Enseignant e : EnseignantDAO.list) {
			if(e.getNumeroEnseignant() == obj.getNumeroEnseignant()) {
				EnseignantDAO.list.remove(e);
			}
		}
		EnseignantDAO.list.add(obj);		
		return obj;
	}

	public void delete(Enseignant obj) {
		EnseignantDAO.list.remove(obj);
	}	

	private void loadMesCreneaux(Enseignant obj) {
	
	}
	
	public static void loadMesEnseignants(){
		list.add(new Enseignant(1,"Zidane", "Zinedine", "1 avenue des coups de boule" , "0143855907",new GregorianCalendar(1960,10, 10), "logZinedine", "pwdZidane"));
		list.add(new Enseignant(2,"Menez", "Jeremy", "2 avenue des croqueurs" , "0143855908",new GregorianCalendar(1970,9, 20), "logJeremy", "pwdMenez"));
		list.add(new Enseignant(3,"Giroud", "Olivier", "3 avenue des coupeurs d'orange" , "0143855909",new GregorianCalendar(1980,8, 16), "logOlivier", "pwdGiroud"));
		list.add(new Enseignant(4,"Benzema", "Karim", "4 avenue des pieds carrés" , "0143855906",new GregorianCalendar(1975,3, 23), "logKarim", "pwdBenzema"));
		list.add(new Enseignant(5,"Evra", "Patrice", "5 rue des greviste" , "0143855905",new GregorianCalendar(1965,2, 7), "logPatrice", "pwdEvra"));
	}
	

	public void loadMesVoeuxEC(Enseignant obj) {
	
	}
	
	public void loadMesServices(Enseignant obj) {

	}
	
	public List<Examen> loadMesExamens(Enseignant obj) {
		return new ArrayList<Examen>();
	}
}

