
public class Type {
    private int NumeroType;
    private String Libelle;
	
    public Type() {
	}

	public Type(int numeroType, String libelle) {
		NumeroType = numeroType;
		Libelle = libelle;
	}

	public int getNumeroType() {
		return NumeroType;
	}

	public void setNumeroType(int numeroType) {
		NumeroType = numeroType;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
}
