package testdao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import beans.Jours;

public class JoursDAO {
	
	private static List<Jours> list = new ArrayList<Jours>();
	
	public List<Jours> findAll() {
		return JoursDAO.list;
	}

	public Jours create(Jours obj) {
		JoursDAO.list.add(obj);
		return obj;
	}

	public Jours update(Jours obj) {
		for(Jours j : JoursDAO.list) {
			if(j.getDateDuJour().equals(obj.getDateDuJour())) {
				JoursDAO.list.remove(j);
			}
		}
		JoursDAO.list.add(obj);
		return obj;
	}

	public void delete(Jours obj) {
		JoursDAO.list.remove(obj);
	}

	public Jours find(int arg0) {
		return null;
	}

	public Jours find(GregorianCalendar date) {
		for(Jours j : JoursDAO.list) {
			if(j.getDateDuJour().equals(date)) {
				return j;
			}
		}
		return null;
	}
	
	public static void loadMesJours(){
		JoursDAO.list.add(new Jours(new GregorianCalendar(2012, 05, 25)));
		JoursDAO.list.add(new Jours(new GregorianCalendar(2012, 05, 26)));
		JoursDAO.list.add(new Jours(new GregorianCalendar(2012, 05, 27)));
		JoursDAO.list.add(new Jours(new GregorianCalendar(2012, 05, 28)));
		JoursDAO.list.add(new Jours(new GregorianCalendar(2012, 05, 29)));
	}

	public void loadMesCreneaux(Jours obj) {

	}
	
	public void loadMesIndisponibilites(Jours obj) {
		
	}
	
	public void loadMesReunions(Jours obj) {

	}
	
	public void loadMesExamens(Jours obj) {

	}
}
