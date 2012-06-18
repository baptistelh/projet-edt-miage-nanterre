package beansUtilisation;

import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

import beans.Creneau;
import beans.Jours;

public class verificationCreneaux {


	public static boolean depassementJournee(List<Creneau> c1) {
		boolean result = true;

		// Hashtable pour stocker duree des journées
		Hashtable<GregorianCalendar, Integer> dureesJournees = new Hashtable<GregorianCalendar, Integer>(
				1000);
		Integer ancienneDuree = new Integer(0);

		// parcours jours et addition des durées
		for (Creneau tempC : c1) {
			Jours j = tempC.getDateCreneau();
			// addition des durées
			ancienneDuree = dureesJournees.get(j);
			Integer nvlleDuree = new Integer(tempC.getDuree());
			Integer actualDuree = ancienneDuree + nvlleDuree;
			dureesJournees.put(j.getDate(), actualDuree);
		}

		// verification dépassement par journée en parcourant la hashtable
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

		return result;
	}

	public static boolean chevauchementCreneaux(List<Creneau> c1,
			List<Creneau> c2) {

		boolean result = true;

		for (Creneau temp1 : c1) {
			for (Creneau temp2 : c2) {
				Jours j1 = temp1.getDateCreneau();
				Jours j2 = temp2.getDateCreneau();
				if (j1.equals(j2)) {

					// date arbritraire pour comparaison horaires. Construction
					// heure debut creneau, heure fin creneau
					GregorianCalendar gcDeb1 = new GregorianCalendar(2000, 1,
							1, Integer.parseInt(temp1.getHoraire()), 0, 0);
					GregorianCalendar gcFin1 = new GregorianCalendar(2000, 1,
							1, Integer.parseInt(temp1.getHoraire()),
							temp1.getDuree(), 0);
					GregorianCalendar gcDeb2 = new GregorianCalendar(2000, 1,
							1, Integer.parseInt(temp2.getHoraire()), 0, 0);
					GregorianCalendar gcFin2 = new GregorianCalendar(2000, 1,
							1, Integer.parseInt(temp2.getHoraire()),
							temp2.getDuree(), 0);

					if (((gcDeb2.after(gcDeb1)) && (gcDeb2.before(gcFin1)))
							|| ((gcFin2.after(gcDeb1)) && (gcFin2
									.before(gcFin1)))) {
						result = false;
						// throw new
						// HorairesException("chevauchement d'horaires");
					}
					if (gcFin2.before(gcDeb2)) {
						result = false;
						// throw new
						// HorairesException("debut horaire et fin horaire non concordants");
					}

				}
			}
		}
		return result;

	}

}
