package testdao;
import java.util.ArrayList;
import java.util.List;

import beans.Formation;

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
	
	public static void loadMesFormations(){
		list.add(new Formation(1, "Master 1 Miage apprentissage", 1,"Apprentissage", "Master", "Miage"));
		list.add(new Formation(2, "Master 2 Miage apprentissage", 2,"Apprentissage", "Master", "Miage"));
		list.add(new Formation(3, "Master 1 Miage classique", 1,"Classique", "Master", "Miage"));
		list.add(new Formation(4, "Master 2 Miage classique", 2,"Classique", "Master", "Miage"));
		list.add(new Formation(5, "Licence 3 Miage apprentissage", 3,"Apprentissage", "Licence", "Miage"));
		list.add(new Formation(6, "Licence 3 Miage classique", 3,"Classique", "Licence", "Miage"));
	}

}
