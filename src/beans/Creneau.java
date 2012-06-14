package beans;
import java.util.GregorianCalendar;


public class Creneau {
    private GregorianCalendar Horaire;
    private int Duree;
	
    public Creneau() {
	}

	public Creneau(GregorianCalendar horaire, int duree) {
		Horaire = horaire;
		Duree = duree;
	}

	public GregorianCalendar getHoraire() {
		return Horaire;
	}

	public void setHoraire(GregorianCalendar horaire) {
		Horaire = horaire;
	}

	public int getDuree() {
		return Duree;
	}

	public void setDuree(int duree) {
		Duree = duree;
	}
    
}
