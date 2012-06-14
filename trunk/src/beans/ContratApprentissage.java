package beans;
import java.util.GregorianCalendar;

public class ContratApprentissage {
	private int NumeroContrat;
	private GregorianCalendar DateSignatureA;
	private Double Salaire;
	private int Duree;
	
	public ContratApprentissage() {
	
	}

	public ContratApprentissage(int numeroContrat,
			GregorianCalendar dateSignatureA, Double salaire, int duree) {
		NumeroContrat = numeroContrat;
		DateSignatureA = dateSignatureA;
		Salaire = salaire;
		Duree = duree;
	}

	public int getNumeroContrat() {
		return NumeroContrat;
	}

	public void setNumeroContrat(int numeroContrat) {
		NumeroContrat = numeroContrat;
	}

	public GregorianCalendar getDateSignatureA() {
		return DateSignatureA;
	}

	public void setDateSignatureA(GregorianCalendar dateSignatureA) {
		DateSignatureA = dateSignatureA;
	}

	public Double getSalaire() {
		return Salaire;
	}

	public void setSalaire(Double salaire) {
		Salaire = salaire;
	}

	public int getDuree() {
		return Duree;
	}

	public void setDuree(int duree) {
		Duree = duree;
	}
	
	
}
