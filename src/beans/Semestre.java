
public class Semestre {
    private int NumeroSemestre;
    private String Libelle;
	
    public Semestre() {
	}

	public Semestre(int numeroSemestre, String libelle) {
		NumeroSemestre = numeroSemestre;
		Libelle = libelle;
	}

	public int getNumeroSemestre() {
		return NumeroSemestre;
	}

	public void setNumeroSemestre(int numeroSemestre) {
		NumeroSemestre = numeroSemestre;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
}
