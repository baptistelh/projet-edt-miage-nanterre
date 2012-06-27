package testdao;
import java.util.ArrayList;
import java.util.List;

import beans.*;

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
			if(s.getNumeroSalle() == obj.getNumeroSalle())
				SalleDAO.list.remove(s);
		}
		SalleDAO.list.add(obj);		
		return obj;
	}

	
	
	public Salle find(String no_salle) {
		for(Salle s : SalleDAO.list) {
			if(s.getNumeroSalle() == no_salle)
				return s;
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

}
