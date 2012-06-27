package beansutilisation;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import beans.Creneau;
import beans.EC;
import beans.Jours;
import beans.Promotion;
import beans.Salle;
import beans.UE;

public class VerificationPromoSalle {
	
	public static boolean verifSalle(List<Creneau> c1, Salle s1) {
		
		return VerificationCreneaux.chevauchementCreneaux(c1, s1.getMesCreneaux());
		
}
	
	public static boolean verifPromo(List<Creneau> c1, Promotion s1){
		
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
		
		return VerificationCreneaux.chevauchementCreneaux(c1, l1);
	}
}
