package beansutilisation;

import beans.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

public final class EnseignantEDT {

	private EnseignantEDT() {
		// TODO Auto-generated constructor stub
	}
	
	public static void TestEnseignant(List<Creneau> newCreneaux, Enseignant e)
			throws VerificationException {

		if (!EnseignantEDT.respectVoeuxEnseignant(newCreneaux, e))
			throw new VerificationException("voeux enseignants non respectes");

		if (!VerificationCreneaux.chevauchementCreneaux(newCreneaux,
				e.getMesCreneaux()))
			throw new VerificationException("le nouveau creneau pour cet enseignant est deja alloue");
		
		
		//Creation d'une liste mergeant les anciens crenaux et le nouveau recu
		
		ArrayList<Creneau> crenToTest = new ArrayList<Creneau>();
		
		crenToTest.addAll(newCreneaux);
		crenToTest.addAll(e.getMesCreneaux());
		if (!VerificationCreneaux.depassementJournee(crenToTest))
			throw new VerificationException("L'enseignant a déjà un nombre d'heure suffisant pour la semaine");

	}

	public static boolean respectVoeuxEnseignant(List<Creneau> creneaux,
			Enseignant e) {
		boolean result = true;
		List<Indisponibilite> indispos = e.getMesIndisponibilites();
		List<Creneau> indisposC = new ArrayList<Creneau>();
		String horaireIndispo;
		Enseignant tempEns = e;
		Salle tempSalle = new Salle();
		EC tempEC = new EC();
		Type tempType = new Type();
		// On parcours la liste des indispos. On garde que les indispos ou
		// poids=0 et on crée une liste de creneaux les contenant pour
		// comparaison avec creneau de l'enseigant (souhaité et deja
		// enregistrés)
		for (Indisponibilite i : indispos) {
			if (i.getPoids() != 0) {
				indispos.remove(i);
			} else {
				// si l'indispo concerne le matin --> creneau genere= horaire:
				// 08:30, sinon 13:45 et duree: 4h(240mn) .
				if (i.getDemiJournee() == 0) {
					horaireIndispo = "08:30";
				} else {
					horaireIndispo = "13:45";
				}
				Creneau temp = new Creneau(tempEns, tempSalle, tempEC,
						tempType, i.getDateIndisponibilite(), horaireIndispo,
						240);
				indisposC.add(temp);

			}
		}

		result = VerificationCreneaux
				.chevauchementCreneaux(indisposC, creneaux);

		return result;
	}
}
