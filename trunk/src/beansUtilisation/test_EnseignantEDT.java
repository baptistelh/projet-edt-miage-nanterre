package beansUtilisation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import beans.Creneau;
import beans.EC;
import beans.Enseignant;
import beans.Formation;
import beans.Jours;
import beans.Salle;
import beans.Type;
import beans.UE;

public class test_EnseignantEDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lundi
		Enseignant e1 = new Enseignant(1, "Aragou", "muriel",
				"1 avenue du meilleur des tuteurs", "0143855907",
				new GregorianCalendar(1960, 10, 10), "logAragou", "pwdAragou");
		Salle s1 = new Salle("210A", 50, "enferNum1");
		Formation F1 = new Formation();
		UE ue1 = new UE(1, F1);
		EC ec1 = new EC(1, ue1, F1);
		Type type1 = new Type(1, "TD");
		
		
		Creneau cLundi = new Creneau(e1, s1, ec1, type1, "09:00", 120);
		Jours j1 = new Jours();
		j1.setDate(new GregorianCalendar(2012, 05, 11));
		cLundi.setDateCreneau(j1);
		
		Creneau cMardi = new Creneau(e1, s1, ec1,type1, "11:00", 120);
		Jours j2=new Jours();
		j2.setDate(new GregorianCalendar(2012, 05, 12));
		cMardi.setDateCreneau(j2);	
		
		Creneau cJeudi = new Creneau(e1, s1, ec1,type1, "13:00", 120);
		Jours j4=new Jours();
		j4.setDate(new GregorianCalendar(2012, 05, 14));
		cJeudi.setDateCreneau(j4);
		
		List <Creneau> mesC = new ArrayList<Creneau>();
		mesC.add(cLundi);
		mesC.add(cMardi);
		mesC.add(cJeudi);
		System.out.println(mesC.toString());
		
		List <Creneau> mesC2 = new ArrayList<Creneau>();
		Creneau cLundi2 = new Creneau(e1, s1, ec1, type1, "09:00", 120);
		Jours j12 = new Jours();
		j12.setDate(new GregorianCalendar(2012, 05, 11));
		cLundi2.setDateCreneau(j12);
		mesC2.add(cLundi2);
		
		e1.setMesCreneaux(mesC);
		
		System.out.println(verificationCreneaux.chevauchementCreneaux(mesC,mesC2));

	}

}
