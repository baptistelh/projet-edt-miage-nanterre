package testdao;
import java.util.ArrayList;
import java.util.List;

import beans.Salle;

public class SalleDAO {
	private static List<Salle> list = new ArrayList<Salle>();
	
	public Salle create(Salle obj) {
		SalleDAO.list.add(obj);
		return obj;
	}

	public void delete(Salle obj) {
		SalleDAO.list.remove(obj);
	}

	public List<Salle> findAll() {
		return list;
	}

	public Salle update(Salle obj) {
		for(Salle s : SalleDAO.list) {
			if(s.getNumeroSalle() == obj.getNumeroSalle()) {
				SalleDAO.list.remove(s);
			}
		}
		SalleDAO.list.add(obj);		
		return obj;
	}

	
	
	public Salle find(String noSalle) {
		for(Salle s : SalleDAO.list) {
			if(s.getNumeroSalle().equals(noSalle)) {
				return s;
			}
		}
		return null;
	}

	public Salle find(int arg0) {
		return null;
	}
	
	public void loadMesCreneaux(Salle obj) {
	
	}
	
	public void loadMesReunions(Salle obj) {
		
	}

	public static void loadMesSalles(){
		list.add(new Salle ("210A",24,"Batiment G"));
		list.add(new Salle ("210B",28,"Batiment G"));
		list.add(new Salle ("307",16,"Batiment G"));
	}
}
