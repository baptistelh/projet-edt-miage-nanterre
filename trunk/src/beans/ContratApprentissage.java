package beans;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class ContratApprentissage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1037544576331343693L;
	private int numeroContrat;
	private GregorianCalendar dateSignatureA;
	private double salaire;
	private int duree;
	private Etudiant monEtudiant;
	private Entreprise monEntreprise;
	
	/**
	 * 
	 */
	public ContratApprentissage() {
		super();
	}

	/**
	 * @param numeroContrat
	 * @param dateSignatureA
	 * @param salaire
	 * @param duree
	 * @param numeroEtudiant
	 * @param numeroEntreprise
	 */
	public ContratApprentissage(int numeroContrat,
			GregorianCalendar dateSignatureA, double salaire, int duree) {
		this();
		this.numeroContrat = numeroContrat;
		this.dateSignatureA = dateSignatureA;
		this.salaire = salaire;
		this.duree = duree;
	}
	
	public ContratApprentissage(int numeroContrat){
		this(numeroContrat,new GregorianCalendar(),0,0);
	}

	/**
	 * @return the numeroContrat
	 */
	public int getNumeroContrat() {
		return numeroContrat;
	}

	/**
	 * @param numeroContrat the numeroContrat to set
	 */
	public void setNumeroContrat(int numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	/**
	 * @return the dateSignatureA
	 */
	public GregorianCalendar getDateSignatureA() {
		return dateSignatureA;
	}

	/**
	 * @param dateSignatureA the dateSignatureA to set
	 */
	public void setDateSignatureA(GregorianCalendar dateSignatureA) {
		this.dateSignatureA = dateSignatureA;
	}

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Etudiant getMonEtudiant() {
		return monEtudiant;
	}

	public void setMonEtudiant(Etudiant monEtudiant) {
		this.monEtudiant = monEtudiant;
	}

	public Entreprise getMonEntreprise() {
		return monEntreprise;
	}

	public void setMonEntreprise(Entreprise monEntreprise) {
		this.monEntreprise = monEntreprise;
	}
	
}
