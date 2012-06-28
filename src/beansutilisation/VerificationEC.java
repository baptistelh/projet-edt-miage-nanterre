package beansutilisation;

import beans.Creneau;
import beans.EC;
import beans.Necessite;
import beans.Type;

public final class VerificationEC {
	
	private VerificationEC() {
		// TODO Auto-generated constructor stub
	}
	
	public static void verificationTempsEC (EC monEC, Type t) throws VerificationException{
		if (monEC.getMesNecessites().get(getIndexOfNecessite(monEC,t)).getNb_maquette()!=getNbMinutesCreneaux(monEC,t)) {
			throw new VerificationException("pb verification EC");
		}
	}
	
	private static int getNbMinutesCreneaux(EC monEC, Type t){
		int minTot=0;
		for (Creneau c:monEC.getMesCreneaux()){
			if (c.getMonType().equals(t)) {
				minTot=minTot+c.getDuree();
			}
		}
		return minTot;
	}
	
	private static int getIndexOfNecessite(EC monEC,Type t){
		int i=0;
		for(Necessite n:monEC.getMesNecessites()){
			if (n.getMonEC().equals(monEC)&&n.getMonType().equals(t)) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
