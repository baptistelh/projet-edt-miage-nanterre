package metier;

import java.util.GregorianCalendar;


public class Salle {
	
	public Salle(int numSalle, int capacite, String lieu) {
		super();
		this.numSalle = numSalle;
		this.capacite = capacite;
		this.lieu = lieu;
	}
	public Salle() {
		super();
	}
	private int numSalle ;
	private int capacite ;
	private String lieu ;
	public int getNumSalle() {
		return numSalle;
	}
	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

}
