package testDAO;

import java.util.ArrayList;
import java.util.List;

import beans.*;

public class EnseignantDAO {
	
	private static List<Enseignant> list = new ArrayList<Enseignant>();
	
	public Enseignant find(int id) {
		for(Enseignant e : EnseignantDAO.list) {
			if(e.getNumeroEnseignant() == id)
				return e;
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
			if(e.getNumeroEnseignant() == obj.getNumeroEnseignant())
				EnseignantDAO.list.remove(e);
		}
		EnseignantDAO.list.add(obj);		
		return obj;
	}

	public void delete(Enseignant obj) {
		EnseignantDAO.list.remove(obj);
	}	

	private void loadMesCreneaux(Enseignant obj) {
	
	}
	

	public void loadMesVoeuxEC(Enseignant obj) {
	
	}
	
	public void loadMesServices(Enseignant obj) {

	}
	
	public List<Examen> loadMesExamens(Enseignant obj) {
		return new ArrayList<Examen>();
	}
}

