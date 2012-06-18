package beansUtilisation;

import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

import beans.Creneau;
import beans.Jours;
import beans.Promotion;
import beans.Salle;

public class VerifCreneauxNv {

	
	public static DepassementSemaine[] heureMaxSemaine(List<Creneau> c){
		// Hashtable pour stocker duree des journées
		Hashtable<GregorianCalendar, Integer> dureesJournees = new Hashtable<GregorianCalendar, Integer>();

		// parcours jours et addition des durées
		for (Creneau tempC : c) {
			// recuperation date du creneau
			GregorianCalendar g = tempC.getDateCreneau().getDate();
			
			// recuperation et addition durée
			int duree = dureesJournees.get(g);
			duree += tempC.getDuree();
			
			// Mise à jour dans la hashtable
			dureesJournees.put(g, duree);
		}

		// verification dépassement par semaine en parcourant la hashtable
		Enumeration<GregorianCalendar> enu = dureesJournees.keys();
		while (enu.hasMoreElements()) {
			GregorianCalendar o = enu.nextElement();
			Integer dureeJournee = dureesJournees.get(o);
			if (dureeJournee > 480) {
				result = false;
				// throw new
				// HorairesException("journne depassant 8h" + o.toString());
			}
		}
		
		return false;
		
		
	}
}
