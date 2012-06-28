package beansutilisation;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import beans.Creneau;
import beans.EC;
import beans.Enseignant;
import beans.Formation;
import beans.Jours;
import beans.Promotion;
import beans.Salle;
import beans.Type;
import beans.UE;

public class VerificationPromoSalle {
	
	public static void verifSalle(List<Creneau> c1, Salle s1) throws VerificationException {
		if (!VerificationCreneaux.chevauchementCreneaux(c1, s1.getMesCreneaux())){
			throw new VerificationException("Salle deja occupee");
			
		}
}
	
	public static void verifPromo(List<Creneau> c1, Promotion s1) throws VerificationException{
		
		List<Creneau> l0= new ArrayList<Creneau>();
		List<Creneau> l1= new ArrayList<Creneau>();
		List<UE> l2 = s1.getMaFormation().getMesUE();
		List<EC> l3= new ArrayList<EC>();
		for(int i = 0;i<l2.size();i++){
			l3= l2.get(i).getMesEC();
				for(int j = 0;j<l3.size();j++){
					l0 = l3.get(j).getMesCreneaux();
					for(int k = 0;k<l0.size();k++){
						l1.add(l0.get(k));
					}
				}
		}
		
		if(!VerificationCreneaux.chevauchementCreneaux(c1, l1)){
			throw new VerificationException("Promo deja occupee");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lundi
		Enseignant e1=new Enseignant(1,"Aragou", "muriel", "1 avenue du meilleur des tuteurs" , "0143855907",new GregorianCalendar(1960,10, 10), "logAragou", "pwdAragou");	
		
		List <Creneau> l1= new ArrayList<Creneau>();
		List <Creneau> l2= new ArrayList<Creneau>();
		Salle s1=new Salle("210A", 50, "enferNum1");
		Salle s2=new Salle("210A", 50, "enferNum1");
		Formation f1=new Formation();
		UE ue1=new UE(1,f1);
		EC ec1= new EC(1, ue1);
		Type type1 = new Type(1, "TD"); 
		Jours j1 = new Jours(new GregorianCalendar(2012, 05, 27));
		Creneau cLundi = new Creneau(e1, s1, ec1,type1, j1 , "09:00", 120);
		cLundi.setDateCreneau(j1);
		l1.add(cLundi);
		s1.setMesCreneaux(l1);
		s2.setMesCreneaux(l2);
		
		try {
			verifSalle(l1, s1);
		} catch(Exception e) { 
			e.printStackTrace(); 
		}
		
		try {
			verifSalle(l1, s2);
		} catch(Exception e) { 
			e.printStackTrace(); 
		}
		
	}
}
