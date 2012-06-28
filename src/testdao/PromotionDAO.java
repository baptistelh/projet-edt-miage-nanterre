package testdao;

import java.util.ArrayList;
import java.util.List;

import beans.*;

public class PromotionDAO {

	private static List<Promotion> list = new ArrayList<Promotion>();

	public Promotion find(int id) {
		for(Promotion p : PromotionDAO.list) {
			if(p.getNumeroPromotion() == id)
				return p;
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
			if(p.getNumeroPromotion() == obj.getNumeroPromotion())
				PromotionDAO.list.remove(p);
		}
		PromotionDAO.list.add(obj);
		return obj;
	}

	public void delete(Promotion obj) {
		PromotionDAO.list.remove(obj);
	}


}
