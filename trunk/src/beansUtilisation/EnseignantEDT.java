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

		boolean depassementjournee = verificationCreneaux
				.depassementJournee(merge);
		boolean voeux = respectVoeuxEnseignant(merge, e);
		
		if(chevauche && depassementjournee && voeux){
			e.setMesCreneaux(merge);
			ODBC_onur.setCreneau(connection, e);
		}
	}

	public boolean respectVoeuxEnseignant(List<Creneau> creneaux, Enseignant e){
		boolean result=true;
		List <Indisponibilite> indispos =e.getMesIndispos();
		List <Creneau> indisposC = null;
		String horaireIndispo;
		// On parcours la liste des indispos. On garde que les indispos ou poids=0 et on crée une liste de creneaux les contenant pour comparaison avec creneau de l'enseigant (souhaité et deja enregistrés)
		for (Indisponibilite i:indispos){
			if (i.getPoids()!=0){
				indispos.remove(i);
			}
			else{
				//si l'indispo concerne le matin --> creneau genere= horaire: 08:30, sinon 13:45 et duree: 4h(240mn) .
				if (i.getDemiJournee()==0){
					horaireIndispo="08:30";
				}else{
					horaireIndispo="13:45";
				}
				Creneau temp= new Creneau(null,null,null,null,horaireIndispo,240);
				temp.setDateCreneau(i.getDateIndisponibilite());
				indisposC.add(temp);
				
			}
		}
		
		result=verificationCreneaux.chevauchementCreneaux(indisposC, e.getMesCreneaux());
		
		return result;
	}
}
