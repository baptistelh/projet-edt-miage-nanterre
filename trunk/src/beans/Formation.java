package beans;
public class Formation {
    private int NumeroFormation;
    private String Libelle;
    private String Niveau;
    private String Type;
    private String Parcours;
	
    public Formation() {
	}

	public Formation(int numeroFormation, String libelle, String niveau,
			String type, String parcours) {
		NumeroFormation = numeroFormation;
		Libelle = libelle;
		Niveau = niveau;
		Type = type;
		Parcours = parcours;
	}

	public int getNumeroFormation() {
		return NumeroFormation;
	}

	public void setNumeroFormation(int numeroFormation) {
		NumeroFormation = numeroFormation;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public String getNiveau() {
		return Niveau;
	}

	public void setNiveau(String niveau) {
		Niveau = niveau;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getParcours() {
		return Parcours;
	}

	public void setParcours(String parcours) {
		Parcours = parcours;
	}
}
