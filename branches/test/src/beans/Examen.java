
package beans;
import java.util.GregorianCalendar;


public class Examen {
    private int NumeroExamen;
    private GregorianCalendar Horaire;
    private String Libelle;
    private Double coefficient;
	
    public Examen() {
	}

	public Examen(int numeroExamen, GregorianCalendar horaire, String libelle,
			Double coefficient) {
		NumeroExamen = numeroExamen;
		Horaire = horaire;
		Libelle = libelle;
		this.coefficient = coefficient;
	}

	public int getNumeroExamen() {
		return NumeroExamen;
	}

	public void setNumeroExamen(int numeroExamen) {
		NumeroExamen = numeroExamen;
	}

	public GregorianCalendar getHoraire() {
		return Horaire;
	}

	public void setHoraire(GregorianCalendar horaire) {
		Horaire = horaire;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public Double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Double coefficient) {
		this.coefficient = coefficient;
	}
}
