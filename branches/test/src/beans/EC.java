package beans;
public class EC {
    private int NumeroEC;
    private String Libelle;
    private double Coef;
	
    public EC() {
	}
	
    public EC(int numeroEC, String libelle, double coef) {
		NumeroEC = numeroEC;
		Libelle = libelle;
		Coef = coef;
	}

	public int getNumeroEC() {
		return NumeroEC;
	}

	public void setNumeroEC(int numeroEC) {
		NumeroEC = numeroEC;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public double getCoef() {
		return Coef;
	}

	public void setCoef(double coef) {
		Coef = coef;
	}
}
