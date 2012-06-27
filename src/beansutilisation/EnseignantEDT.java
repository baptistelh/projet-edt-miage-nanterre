package beansutilisation;

import beans.*;

import java.util.ArrayList;
import java.util.List;

import testdao.CreneauDAO;

public class EnseignantEDT {

	public void setCreneau(List<Creneau> newCreneaux, Enseignant e) {

		// Connection à la base et récupération de tous les créneaux de
		// l'enseignant en paramètre
//		String login = "";
//		String password = "";
//		String url = "";
//		Connection connection = ODBC_onur.getConnectiontoDB(login, password,
//				url);
		CreneauDAO creneauDAO = new CreneauDAO();
		List<Creneau> creneauxRegistred = creneauDAO.findAll();

		// Comparaison chevauchement creneaux;
		boolean chevauche = VerificationCreneaux.chevauchementCreneaux(
				creneauxRegistred, newCreneaux);
		List<Creneau> merge = creneauxRegistred;
		merge.addAll(newCreneaux);

		boolean depassementjournee = VerificationCreneaux
				.depassementJournee(merge);
		boolean voeux = respectVoeuxEnseignant(merge, e);
		
		if(chevauche && depassementjournee && voeux){
			e.setMesCreneaux(merge);
//			creneauDAO.create(obj);
		}
	}

	public static boolean respectVoeuxEnseignant(List<Creneau> creneaux, Enseignant e){
		boolean result=true;
		List <Indisponibilite> indispos =e.getMesIndisponibilites();
		List <Creneau> indisposC = new ArrayList<Creneau>();
		String horaireIndispo;
		Enseignant tempEns=e;
		Salle tempSalle=new Salle();
		EC tempEC =new EC();
		Type tempType=new Type();
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
				Creneau temp= new Creneau(tempEns,tempSalle,tempEC,tempType,i.getDateIndisponibilite(),horaireIndispo,240);
				indisposC.add(temp);
				
			}
		}
		
		result=VerificationCreneaux.chevauchementCreneaux(indisposC, e.getMesCreneaux());
		
		return result;
	}
}
