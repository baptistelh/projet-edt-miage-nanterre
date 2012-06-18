package beansUtilisation;

import beans.*;

import java.sql.Connection;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;



public class EnseignantEDT {

	public void setCreneau(List<Creneau> newCreneaux, Enseignant e) {

		// Connection à la base et récupération de tous les créneaux de
		// l'enseignant en paramètre
		String login = "";
		String password = "";
		String url = "";
		Connection connection = ODBC_onur.getConnectiontoDB(login, password,
				url);
		List<Creneau> creneauxRegistred = ODBC_onur.getCreneaux(connection, e);

		// Comparaison chevauchement creneaux;
		boolean chevauche = verificationCreneaux.chevauchementCreneaux(
				creneauxRegistred, newCreneaux);
		List<Creneau> merge = creneauxRegistred;
		merge.addAll(newCreneaux);

		boolean depassementjournee = verificationCreneaux.depassementJournee(merge);
		boolean voeux=respectVoeuxEnseignant(merge,e);

	}
	
	public boolean respectVoeuxEnseignant(List<Creneau> creneaux, Enseignant e){
		boolean result=true;
		
		
		
		
		return result;
	}

	
}
