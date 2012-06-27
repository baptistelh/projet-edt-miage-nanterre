package beansutilisation;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import beans.Creneau;
import beans.EC;
import beans.Enseignant;
import beans.Formation;
import beans.Indisponibilite;
import beans.Jours;
import beans.Salle;
import beans.Type;
import beans.UE;

public class EnseignantEDTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lundi
		Enseignant e1 = new Enseignant(1, "Aragou", "muriel",
				"1 avenue du meilleur des tuteurs", "0143855907",
				new GregorianCalendar(1960, 10, 10), "logAragou", "pwdAragou");
		Salle s1 = new Salle("210A", 50, "enferNum1");
		Formation f1 = new Formation();
		UE ue1 = new UE(1, f1);
		EC ec1 = new EC(1, ue1);
		Type type1 = new Type(1, "TD");

		Jours j1 = new Jours();
		j1.setDateDuJour(new GregorianCalendar(2012, 05, 11));
		Creneau cLundi = new Creneau(e1, s1, ec1, type1, j1, "09:00", 52);

		Jours j2 = new Jours();
		j2.setDateDuJour(new GregorianCalendar(2012, 05, 12));
		Creneau cMardi = new Creneau(e1, s1, ec1, type1, j2, "11:00", 120);

		Jours j4 = new Jours();
		j4.setDateDuJour(new GregorianCalendar(2012, 05, 14));
		Creneau cJeudi = new Creneau(e1, s1, ec1, type1, j4, "13:00", 120);

		List<Creneau> mesC = new ArrayList<Creneau>();
		mesC.add(cLundi);
		mesC.add(cMardi);
		mesC.add(cJeudi);
		//System.out.println(mesC.toString());
		//System.out.println(verificationCreneaux.depassementJournee(mesC));
		
		List<Creneau> mesC2 = new ArrayList<Creneau>();
		Jours j12 = new Jours();
		j12.setDateDuJour(new GregorianCalendar(2012, 05, 11));

		Creneau cLundi2 = new Creneau(e1, s1, ec1, type1,j12, "09:00", 120);
		List<Indisponibilite> mesIndps=new ArrayList<Indisponibilite>();
		
		mesC2.add(cLundi2);
		Indisponibilite indp=new Indisponibilite(e1, j12, 0,0);
		mesIndps.add(indp);
		e1.setMesCreneaux(mesC);
		e1.setMesIndisponibilites(mesIndps);
		System.out.println(EnseignantEDT.respectVoeuxEnseignant(e1.getMesCreneaux(), e1));
		/*System.out.println(verificationCreneaux.chevauchementCreneaux(mesC,
				mesC2));*/

	}

}
