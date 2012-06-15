package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class EC implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3979268140005307652L;
	private int numeroEC;
	private UE monUE;
    private Formation maFormation;
    private String libelle;
    private double coef;
    private List<Enseignant> mesEnseignants = new ArrayList<Enseignant>();
    private List<Examen> mesExamens = new ArrayList<Examen>();
    private List<Necessite> mesNecessites = new ArrayList<Necessite>();
    private List<VoeuxEC> mesVoeuxEC = new ArrayList<VoeuxEC>();
    private List<Creneau> mesCreneaux = new ArrayList<Creneau>();
    private List<Service> mesServices = new ArrayList<Service>();
	
    
    public EC() {
    	super();
	}
	
    public EC(int numeroEC, UE monUE, Formation maFormation, String libelle, double coef) {
    	this();
		this.setNumeroEC(numeroEC);
		this.setMonUE(monUE);
		this.setMaFormation(maFormation);
		this.setLibelle(libelle);
		this.setCoef(coef);
	}
    
    public EC(int numeroEC,  UE monUE, Formation maFormation) {
    	this(numeroEC, monUE, maFormation, "", 0);
    }
    	
	public int getNumeroEC() {
		return numeroEC;
	}

	public void setNumeroEC(int numeroEC) {
		this.numeroEC = numeroEC;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getCoef() {
		return coef;
	}

	public void setCoef(double coef) {
		this.coef = coef;
	}

	public List<Enseignant> getMesEnseignants() {
		return mesEnseignants;
	}

	public void setMesEnseignants(List<Enseignant> mesEnseignants) {
		this.mesEnseignants = mesEnseignants;
	}

	public UE getMonUE() {
		return monUE;
	}

	public void setMonUE(UE monUE) {
		this.monUE = monUE;
	}

	public Formation getMaFormation() {
		return maFormation;
	}

	public void setMaFormation(Formation maFormation) {
		this.maFormation = maFormation;
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

	public List<VoeuxEC> getMesVoeuxEC() {
		return mesVoeuxEC;
	}

	public void setMesVoeuxEC(List<VoeuxEC> mesVoeuxEC) {
		this.mesVoeuxEC = mesVoeuxEC;
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
