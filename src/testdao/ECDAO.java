package testdao;
import java.util.ArrayList;
import java.util.List;

import beans.*;


public class ECDAO {
	
	private static List<EC> list = new ArrayList<EC>();

	public EC find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public EC find(int numEc, int numUe, int numFormation) {
		for(EC e : ECDAO.list) {
			if(e.getNumeroEC() == numEc) {
				return e;
			}
		}
		return null;
	}

	public List<EC> findAll() {
	    return ECDAO.list;
	}
	
	public EC create(EC obj) {
		ECDAO.list.add(obj);
		return obj;
	}

	public EC update(EC obj) {
		for(EC e : ECDAO.list) {
			if(e.getNumeroEC() == obj.getNumeroEC()) {
				ECDAO.list.remove(e);
			}
		}
		ECDAO.list.add(obj);
		return obj;
	}

	public void delete(EC obj) {
		ECDAO.list.remove(obj);
	}
	
	public void loadMesExamens(EC obj) {

	}
	
	public void loadMesNecessites(EC obj) {

	}
	
	public void loadMesVoeuxEC(EC obj) {

	}
	
	public void loadMesCreneaux(EC obj) {

	}
	
	public void loadMesServices(EC obj){

	}
	
	public static void loadMesEC(){
		// Attention aux UE
		list.add(new EC(1, new UE(), "POO", 3));
		list.add(new EC(2, new UE(), "CAR1", 3));
		list.add(new EC(3, new UE(), "CAR2", 3));
		list.add(new EC(4, new UE(), "Genie Logiciel", 3));
		list.add(new EC(5, new UE(), "Optimisation combinatoire", 3));
	}

}
