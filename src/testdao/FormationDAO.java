package testdao;
import java.util.ArrayList;
import java.util.List;

import beans.*;

public class FormationDAO {
	
	private static List<Formation> list = new ArrayList<Formation>();


	public Formation find(int id) {
		for(Formation f : FormationDAO.list) {
			if(f.getNumeroFormation() == id)
				return f;
		}
		return null;
	}
	
	public List<Formation> findAll() {
		return FormationDAO.list;
	}

	public Formation create(Formation obj) {
		FormationDAO.list.add(obj);
		return obj;
	}

	public Formation update(Formation obj) {
		for(Formation f : FormationDAO.list) {
			if(f.getNumeroFormation() == obj.getNumeroFormation())
				FormationDAO.list.remove(f);
		}
		FormationDAO.list.add(obj);
		return obj;
	}

	public void delete(Formation obj) {
		FormationDAO.list.remove(obj);
	}
	
	public void loadMesUE(Formation obj) {

	}
	
	public void loadMesPromotions(Formation obj) {

	}

}
