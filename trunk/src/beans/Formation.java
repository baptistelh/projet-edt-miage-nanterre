package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Formation implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7535003487189395864L;
	private int numeroFormation;
    private ContratQuadriennal monContrat;
    private List<UE> mesUE = new ArrayList<UE>();
    private List<Promotion> mesPromotions = new ArrayList<Promotion>();
    private String libelle;
    private String niveau;
    private String type;
    private String parcours;
	
    public Formation() {
    	super();
	}

	public Formation(int numeroFormation, String libelle, String niveau,String type, String parcours) {
		this();
		this.numeroFormation = numeroFormation;
		this.libelle = libelle;
		this.niveau = niveau;
		this.type = type;
		this.parcours = parcours;
	}
	
	public Formation(int numeroFormation){
		this(numeroFormation, "","","","");
	}
	
	public int getNumeroFormation() {
		return numeroFormation;
	}

	public void setNumeroFormation(int numeroFormation) {
		this.numeroFormation = numeroFormation;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParcours() {
		return parcours;
	}

	public void setParcours(String parcours) {
		this.parcours = parcours;
	}


	public ContratQuadriennal getMonContrat() {
		return monContrat;
	}

	public void setMonContrat(ContratQuadriennal monContrat) {
		this.monContrat = monContrat;
	}

	public List<UE> getMesUE() {
		return mesUE;
	}

	public void setMesUE(List<UE> mesUE) {
		this.mesUE = mesUE;
	}

	public List<Promotion> getMesPromotions() {
		return mesPromotions;
	}

	public void setMesPromotions(List<Promotion> mesPromotions) {
		this.mesPromotions = mesPromotions;
	}
}
