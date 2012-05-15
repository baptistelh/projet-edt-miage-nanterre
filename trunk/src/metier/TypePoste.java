package metier;

public class TypePoste {
	
	private int numPoste ; 
	private String type ;
	private String description ; 
	private int nbheures ;

	// Constructeur avec 0 parametre : obligatoire pr utiliser classe en question dans JSP bean
	public TypePoste() {
		super();
	}
	
	public TypePoste(int numPoste, String type, String description,
			int nbheures) {
		super();
		this.numPoste = numPoste;
		this.type = type;
		this.description = description;
		this.nbheures = nbheures;
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

	public int getNbheures() {
		return nbheures;
	}

	public void setNbheures(int nbheures) {
		this.nbheures = nbheures;
	}
	
	
	


}
