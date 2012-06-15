package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Type implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6776363372380922081L;
	private int numeroType;
    private String libelle;
    private List<Examen> mesExamens = new ArrayList<Examen>();
    private List<Necessite> mesNecessites = new ArrayList<Necessite>();
    private List<Creneau> mesCreneaux = new ArrayList<Creneau>();
    private List<Service> mesServices = new ArrayList<Service>();
	
    public Type() {
    	super();
	}

	public Type(int numeroType, String libelle) {
		this();
		this.numeroType = numeroType;
		this.libelle = libelle;
	}

	public Type(int numeroType){
		this(numeroType,"");
	}
	
	public int getNumeroType() {
		return numeroType;
	}

	public void setNumeroType(int numeroType) {
		this.numeroType = numeroType;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Examen> getMesExamens() {
		return mesExamens;
	}

	public void setMesExamens(List<Examen> mesExamens) {
		this.mesExamens = mesExamens;
	}

	public List<Necessite> getMesNecessites() {
		return mesNecessites;
	}

	public void setMesNecessites(List<Necessite> mesNecessites) {
		this.mesNecessites = mesNecessites;
	}

	public List<Creneau> getMesCreneaux() {
		return mesCreneaux;
	}

	public void setMesCreneaux(List<Creneau> mesCreneaux) {
		this.mesCreneaux = mesCreneaux;
	}

	public List<Service> getMesServices() {
		return mesServices;
	}

	public void setMesServices(List<Service> mesServices) {
		this.mesServices = mesServices;
	}
}
