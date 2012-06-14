import java.util.GregorianCalendar;


public class Reunion {

	private int numReunion ;
	private GregorianCalendar date ;
	private int numSalle ;
	private String libelle ;
	private String horaire ; 
	private int duree ;

	// Constructeur avec 0 parametre : obligatoire pr utiliser classe en question dans JSP bean
	public Reunion() {
		super();
	}
	
	public Reunion(int numReunion, GregorianCalendar date, int numSalle,
			String libelle, String horaire, int duree) {
		super();
		this.numReunion = numReunion;
		this.date = date;
		this.numSalle = numSalle;
		this.libelle = libelle;
		this.horaire = horaire;
		this.duree = duree;
	}


	public int getNumReunion() {
		return numReunion;
	}
	public void setNumReunion(int numReunion) {
		this.numReunion = numReunion;
	}
	public GregorianCalendar getDate() {
		return date;
	}
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	public int getNumSalle() {
		return numSalle;
	}
	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getHoraire() {
		return horaire;
	}
	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
	

}
