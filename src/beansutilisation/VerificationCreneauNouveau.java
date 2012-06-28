package beansutilisation;

import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

import beans.Creneau;

public final class VerificationCreneauNouveau {

	private VerificationCreneauNouveau() {
		// TODO Auto-generated constructor stub
	}
	
	public static Boolean heureMaxSemaine(List<Creneau> c){
		Boolean r = false;
		
		// Hashtable pour stocker duree des journées
		Hashtable<GregorianCalendar, Integer> dureesJournees = new Hashtable<GregorianCalendar, Integer>();

		// parcours jours et addition des durées
		for (Creneau tempC : c) {
			// recuperation date du creneau
			GregorianCalendar g = tempC.getDateCreneau().getDateDuJour();
			
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
				r = false;
				// throw new
				// HorairesException("journne depassant 8h" + o.toString());
			}
		}
		
		return r;
		
		
	}
}
