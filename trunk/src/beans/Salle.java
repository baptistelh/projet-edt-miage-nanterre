import java.util.GregorianCalendar;


public class Salle {

	private String numSalle ;
	private int capacite ;
	private String lieu ;
	
	public Salle(String numSalle, int capacite, String lieu) {
		super();
		this.numSalle = numSalle;
		this.capacite = capacite;
		this.lieu = lieu;
	}
	public Salle() {
		super();
	}
	
	public String getNumSalle() {
		return numSalle;
	}
	public void setNumSalle(String numSalle) {
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
