package beansUtilisation;

import java.util.GregorianCalendar;

import beans.Creneau;
import beans.EC;
import beans.Enseignant;
import beans.Formation;
import beans.Jours;
import beans.Salle;
import beans.Type;
import beans.UE;

public class CrenauxEDT_test_mercredi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jours jour = new Jours(new GregorianCalendar(2012, 05, 13));
		
		Enseignant enseignant = new Enseignant(2, "Girard", "René", "2 rue des champs élysés" , "0123456789", new GregorianCalendar(1978,7, 2), "Girard", "pwdGirard");
		Salle salle = new Salle("210A", 50, "enferNum1");
		Formation formation = new Formation(1);
		UE ue = new UE(1, formation);
		
		EC ec = new EC(1, ue, formation);
		
		Type type = new Type(1, "TD");
		
		Creneau creneau = new Creneau(enseignant, salle, ec, type, "08:30", 240);
		creneau.setDate(jour);

	}

}
