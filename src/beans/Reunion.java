package beans;
import java.io.Serializable;
public class Reunion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2993752565734149875L;
	private int numReunion ;
	private Jours date ;
	private Salle maSalle ;
	private String libelle ;
	private String horaire ; 
	private int duree ;

	// Constructeur avec 0 parametre : obligatoire pr utiliser classe en question dans JSP bean
	public Reunion() {
		super();
	}
	
	public Reunion(int numReunion, String libelle, String horaire, int duree) {
		this();
		this.numReunion = numReunion;
		this.libelle = libelle;
		this.horaire = horaire;
		this.duree = duree;
	}
	
	public Reunion(int numReunion){
		this(numReunion,"","",0);
	}
	
	public int getNumReunion() {
		return numReunion;
	}
	public void setNumReunion(int numReunion) {
		this.numReunion = numReunion;
	}
	public Jours getDate() {
		return date;
	}
	public void setDate(Jours date) {
		this.date = date;
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

	public Salle getMaSalle() {
		return maSalle;
	}

	public void setMaSalle(Salle maSalle) {
		this.maSalle = maSalle;
	}
}
