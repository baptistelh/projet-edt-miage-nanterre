package beansUtilisation;

import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

import beans.Creneau;
import beans.Jours;

public class verificationCreneaux {


	public static boolean depassementJournee(List<Creneau> c1) {
		boolean result = true;

		// Hashtable pour stocker duree des journ�es
		Hashtable<GregorianCalendar, Integer> dureesJournees = new Hashtable<GregorianCalendar, Integer>(
				1000);
		Integer ancienneDuree = new Integer(0);

		// parcours jours et addition des dur�es
		for (Creneau tempC : c1) {
			Jours j = tempC.getDateCreneau();
			// addition des dur�es
			ancienneDuree = dureesJournees.get(j);
			Integer nvlleDuree = new Integer(tempC.getDuree());
			Integer actualDuree = ancienneDuree + nvlleDuree;
			dureesJournees.put(j.getDate(), actualDuree);
		}

		// verification d�passement par journ�e en parcourant la hashtable
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
				System.out.println(j1.getDate().toString());
				System.out.println(j2.getDate().toString());
				if (j1.getDate().equals(j2.getDate())) {

					// date arbritraire pour comparaison horaires. Construction
					// heure debut creneau, heure fin creneau
					
					int heureDeb1=Integer.parseInt(temp1.getHoraire().substring(0,2));
					int minDeb1=Integer.parseInt(temp1.getHoraire().substring(3));
					GregorianCalendar gcDeb1 = new GregorianCalendar(2000, 1,
							1,heureDeb1,minDeb1, 0);
					
					int minDuree=minDeb1+temp1.getDuree();
					int heureFin1=heureDeb1+(minDuree/60);
					int minFin1=minDuree%60;
					
					GregorianCalendar gcFin1 = new GregorianCalendar(2000, 1,
							1,heureFin1,minFin1, 0);
					
					int heureDeb2=Integer.parseInt(temp2.getHoraire().substring(0,2));
					int minDeb2=Integer.parseInt(temp2.getHoraire().substring(3));
					
					GregorianCalendar gcDeb2 =  new GregorianCalendar(2000, 1,
							1,heureDeb2,minDeb2, 0);
					
					int minDuree2=minDeb2+temp2.getDuree();
					int heureFin2=heureDeb2+(minDuree2/60);
					int minFin2=minDuree2%60;
					
					System.out.println("heuredeb1: " + heureDeb1+"\n");
					System.out.println("mindeb1: " + minDeb1+"\n");
					System.out.println("heureFin1: " + heureFin1+"\n");
					System.out.println("minFin1: " + minFin1+"\n");
					System.out.println("heureDeb2:" + heureDeb2+"\n");
					System.out.println("minFin2:" + minDeb1+"\n");
					System.out.println("heureFin2: " + heureFin2+"\n");
					System.out.println("minFin2: " + minFin2+"\n");
					
					
					GregorianCalendar gcFin2 = new GregorianCalendar(2000, 1,
							1, heureFin2,minFin2, 0);
					
					System.out.println("gcdeb1:" + gcDeb1.get(Calendar.HOUR)+ gcDeb1.get(Calendar.MINUTE)+"\n");
					System.out.println("gcdeb2:" + gcDeb2.get(Calendar.HOUR)+ gcDeb2.get(Calendar.MINUTE) +"\n");
					System.out.println("gcFin1:" + gcFin1.get(Calendar.HOUR)+ gcFin1.get(Calendar.MINUTE) +"\n");
					System.out.println("gcFin2:" + gcFin2.get(Calendar.HOUR)+ gcFin2.get(Calendar.MINUTE) +"\n");
					
					if ((((gcDeb2.after(gcDeb1))||(gcDeb2.equals(gcDeb1))) && (gcDeb2.before(gcFin1)))
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
