package beansUtilisation;

import beans.Creneau;
import beans.Salle;

public class SalleOccupee {
	
	private Salle salle;
	private Creneau creneau;
	
	public SalleOccupee(Salle salle, Creneau creneau) {
		super();
		this.salle = salle;
		this.creneau = creneau;
	}

	
	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}
	
	

}
