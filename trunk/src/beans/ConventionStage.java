package beans;
import java.io.Serializable;
import java.util.GregorianCalendar;


public class ConventionStage implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1016777380511290117L;
	private int numeroConvention;
    private GregorianCalendar dateSignatureC;
    private int dureeC;
    private OffreDeStage monOffreDeStage;
    private Etudiant monEtudiant;
	
    /**
	 * 
	 */
	public ConventionStage() {
		super();
	}

	/**
	 * @param numeroConvention
	 * @param dateSignatureC
	 * @param dureeC
	 * @param numeroOffreDeStage
	 * @param numeroEtudiant
	 */
	public ConventionStage(int numeroConvention,GregorianCalendar dateSignatureC, int dureeC) {
		this();
		this.numeroConvention = numeroConvention;
		this.dateSignatureC = dateSignatureC;
		this.dureeC = dureeC;
	}
	
	public ConventionStage(int numeroConvention){
		this(numeroConvention, new GregorianCalendar(), 0);
	}
	
	/**
	 * @return the numeroConvention
	 */
	public int getNumeroConvention() {
		return numeroConvention;
	}

	/**
	 * @param numeroConvention the numeroConvention to set
	 */
	public void setNumeroConvention(int numeroConvention) {
		this.numeroConvention = numeroConvention;
	}

	/**
	 * @return the dateSignatureC
	 */
	public GregorianCalendar getDateSignatureC() {
		return dateSignatureC;
	}

	/**
	 * @param dateSignatureC the dateSignatureC to set
	 */
	public void setDateSignatureC(GregorianCalendar dateSignatureC) {
		this.dateSignatureC = dateSignatureC;
	}

	/**
	 * @return the dureeC
	 */
	public int getDureeC() {
		return dureeC;
	}

	/**
	 * @param dureeC the dureeC to set
	 */
	public void setDureeC(int dureeC) {
		this.dureeC = dureeC;
	}

	public Etudiant getMonEtudiant() {
		return monEtudiant;
	}

	public void setMonEtudiant(Etudiant monEtudiant) {
		this.monEtudiant = monEtudiant;
	}

	public OffreDeStage getMonOffreDeStage() {
		return monOffreDeStage;
	}

	public void setMonOffreDeStage(OffreDeStage monOffreDeStage) {
		this.monOffreDeStage = monOffreDeStage;
	}
	
}
