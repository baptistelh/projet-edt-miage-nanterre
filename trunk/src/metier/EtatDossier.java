package metier;


public class EtatDossier {
    private int NumeroEtat;
    private String etat;
	
    public EtatDossier() {
	}

	public EtatDossier(int numeroEtat, String etat) {
		NumeroEtat = numeroEtat;
		this.etat = etat;
	}

	public int getNumeroEtat() {
		return NumeroEtat;
	}

	public void setNumeroEtat(int numeroEtat) {
		NumeroEtat = numeroEtat;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}   
}
