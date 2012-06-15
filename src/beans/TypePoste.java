
package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypePoste implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6868868194736979703L;
	private int numPoste ; 
	private String type ;
	private String description ; 
	private int nbHeures ;
	private List<Enseignant> mesEnseignants = new ArrayList<Enseignant>();

	// Constructeur avec 0 parametre : obligatoire pr utiliser classe en question dans JSP bean
	public TypePoste() {
		super();
	}
	
	public TypePoste(int numPoste, String type, String description, int nbHeures) {
		this();
		this.numPoste = numPoste;
		this.type = type;
		this.description = description;
		this.nbHeures = nbHeures;
	}
	
	public TypePoste(int numPoste){
		this(numPoste,"","",0);
	}


	public int getNumPoste() {
		return numPoste;
	}

	public void setNumPoste(int numPoste) {
		this.numPoste = numPoste;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbHeures() {
		return nbHeures;
	}

	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}

	public List<Enseignant> getMesEnseignants() {
		return mesEnseignants;
	}

	public void setMesEnseignants(List<Enseignant> mesEnseignants) {
		this.mesEnseignants = mesEnseignants;
	}

}
