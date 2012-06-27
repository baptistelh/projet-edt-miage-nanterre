package beansutilisation;

import java.util.GregorianCalendar;

import beans.Creneau;
import beans.EC;
import beans.Enseignant;
import beans.Formation;
import beans.Jours;
import beans.Salle;
import beans.Type;
import beans.UE;

public class CrenauEDTTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lundi
		Enseignant e1=new Enseignant(1,"Aragou", "muriel", "1 avenue du meilleur des tuteurs" , "0143855907",new GregorianCalendar(1960,10, 10), "logAragou", "pwdAragou");	
		Salle s1=new Salle("210A", 50, "enferNum1");
		Formation f1=new Formation();
		UE ue1=new UE(1,f1);
		EC ec1= new EC(1, ue1);
		Type type1 = new Type(1, "TD"); 
		Jours j1 = new Jours(new GregorianCalendar(2012, 05, 27));
		Creneau cLundi = new Creneau(e1, s1, ec1,type1, j1 , "09:00", 120);
		cLundi.setDateCreneau(j1);
		
		//Mardi
		Enseignant e2=new Enseignant(1,"Giroud", "Olivier", "1 avenue des coupeurs d'orange" , "0143855908",new GregorianCalendar(1960,10, 10), "logGiroud", "pwdGiroud");	
		Salle s2=new Salle("210B", 50, "enferNum2");
		Formation f2=new Formation();
		UE ue2=new UE(1,f2);
		EC ec2= new EC(1, ue2);
		Type type2 = new Type(1, "TD");
		Jours j2 = new Jours(new GregorianCalendar(2012, 05, 27));
		Creneau cMardi = new Creneau(e2, s2, ec2,type2, j2, "11:00", 120);
		cMardi.setDateCreneau(j2);	
		
		//Mercredi
		Jours jour = new Jours(new GregorianCalendar(2012, 05, 13));
		Enseignant enseignant = new Enseignant(2, "Girard", "Ren�", "2 rue des champs �lys�s" , "0123456789", new GregorianCalendar(1978,7, 2), "Girard", "pwdGirard");
		Salle salle = new Salle("207", 50, "enferNum1");
		Formation f3 = new Formation(1);
		UE ue = new UE(1, f3);
		EC ec = new EC(1, ue);
		Type type = new Type(1, "TD");
		Jours j3 = new Jours(new GregorianCalendar(2012, 05, 27));
		Creneau cMercredi = new Creneau(enseignant, salle, ec, type, j3, "08:30", 240);
		cMercredi.setDateCreneau(jour);
		
		
		//Jeudi
		Enseignant e4=new Enseignant(1,"Menez", "Jeremy", "1 avenue des croqueurs" , "0143855909",new GregorianCalendar(1960,10, 10), "logMenez", "pwdMenez");	
		Salle s4=new Salle("4A", 50, "enferNum4");
		Formation f4=new Formation();
		UE ue4=new UE(1,f4);
		EC ec4= new EC(1, ue4);
		Type type4 = new Type(1, "TD"); 
		Jours j4 = new Jours(new GregorianCalendar(2012, 05, 27));
		Creneau cJeudi = new Creneau(e4, s4, ec4,type4,j4 ,"13:00", 120);
		cJeudi.setDateCreneau(j4);
		
		//Vendredi
		Enseignant e5=new Enseignant(1,"Evra", "Patrice", "1 avenue des grevistes" , "0143855910",new GregorianCalendar(1960,10, 10), "logEvra", "pwdEvra");	
		Salle s5=new Salle("4B", 50, "enferNum5");
		Formation f5 = new Formation();
		UE ue5=new UE(1,f5);
		EC ec5= new EC(1, ue5);
		Type type5 = new Type(1, "CM"); 
		Jours j5 = new Jours(new GregorianCalendar(2012, 05, 27));
		Creneau cVendredi = new Creneau(e5, s5, ec5,type5, j5, "15:00", 120);
		cVendredi.setDateCreneau(j5);
	}
}