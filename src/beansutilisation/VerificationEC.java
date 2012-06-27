package beansutilisation;

import beans.Creneau;
import beans.EC;
import beans.Necessite;
import beans.Type;

public class VerificationEC {
	
	
	public static boolean verificationTempsEC (EC monEC, Type t){
		if (monEC.getMesNecessites().get(getIndexOfNecessite(monEC,t)).getNb_maquette()==getNbMinutesCreneaux(monEC,t))
			return true;
		else
			return false;
		
	}
	
	private static int getNbMinutesCreneaux(EC monEC, Type t){
		int minTot=0;
		for (Creneau c:monEC.getMesCreneaux()){
			if (c.getMonType().equals(t))
			minTot=minTot+c.getDuree();
		}
		return minTot;
	}
	
	private static int getIndexOfNecessite(EC monEC,Type t){
		int i=0;
		for(Necessite n:monEC.getMesNecessites()){
			if (n.getMonEC().equals(monEC)&&n.getMonType().equals(t))
				return i;
			i++;
		}
		return -1;
	}

}
