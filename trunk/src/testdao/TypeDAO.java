package testdao;

import java.util.ArrayList;
import java.util.List;

import beans.*;

public class TypeDAO {
	
	private static List<Type> list = new ArrayList<Type>();

	public Type create(Type obj) {
		TypeDAO.list.add(obj);
		return obj;
	}

	public void delete(Type obj) {
		for(Type t : TypeDAO.list) {
			if(t.getNumeroType() == obj.getNumeroType())
				TypeDAO.list.remove(t);
		}
		TypeDAO.list.add(obj);
	}

	public Type find(int obj) {
		for(Type t : TypeDAO.list) {
			if(t.getNumeroType() == obj)
				return t;
		}
		return null;
	}

	public Type update(Type obj) {
		for(Type t : TypeDAO.list) {
			if(t.getNumeroType() == obj.getNumeroType())
				TypeDAO.list.remove(t);
		}
		TypeDAO.list.add(obj);
		return obj;
	}

	public List<Type> findAll() {
		return TypeDAO.list;
	}
	
	public static void loadMesFormations(){
		list.add(new Type(0,"TD"));
		list.add(new Type(1,"CM"));
	}

}
