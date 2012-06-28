package testdao;

import java.util.ArrayList;
import java.util.List;

import beans.Formation;
import beans.Promotion;

public class PromotionDAO {

	private static List<Promotion> list = new ArrayList<Promotion>();

	public Promotion find(int id) {
		for(Promotion p : PromotionDAO.list) {
			if(p.getNumeroPromotion() == id) {
				return p;
			}
		}
		return null;
	}

	public List<Promotion> findAll() {
	    return PromotionDAO.list;
	}
	
	public Promotion create(Promotion obj) {
		PromotionDAO.list.add(obj);
		return obj;
	}

	public Promotion update(Promotion obj) {
		for(Promotion p : PromotionDAO.list) {
			if(p.getNumeroPromotion() == obj.getNumeroPromotion()) {
				PromotionDAO.list.remove(p);
			}
		}
		PromotionDAO.list.add(obj);
		return obj;
	}

	public void delete(Promotion obj) {
		PromotionDAO.list.remove(obj);
	}
	
	public static void loadMesPromotions(){
		String master = "Master";
		String miage = "Miage";
		
		Promotion p = new Promotion(1);
		p.setMaFormation(new Formation(1, "Master 1 Miage apprentissage", 1,"Apprentissage", master, miage));
		PromotionDAO.list.add(p);
		
		p = new Promotion(2);
		p.setMaFormation(new Formation(2, "Master 2 Miage apprentissage", 2,"Apprentissage", master, miage));
		PromotionDAO.list.add(p);
		
		p = new Promotion(3);
		p.setMaFormation(new Formation(3, "Master 1 Miage classique", 1,"Classique", master, miage));
		PromotionDAO.list.add(p);
		
		p = new Promotion(4);
		p.setMaFormation(new Formation(4, "Master 2 Miage classique", 2,"Classique", master, miage));
		PromotionDAO.list.add(p);

	}
}
