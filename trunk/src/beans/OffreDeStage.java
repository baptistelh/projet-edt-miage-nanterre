package beans;
import java.io.Serializable;


public class OffreDeStage implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4607187441750578538L;
	private int numeroOffreDeStage;
    private String descriptionPoste;
    private String etatOffre;
    private Entreprise monEntreprise;
    private Jours dateDebutStage, dateFinStage;
    private ConventionStage maConvention;
	
    /**
	 * 
	 */
	public OffreDeStage() {
		super();
	}

	/**
	 * @param numeroOffreDeStage
	 * @param descriptionPoste
	 * @param etatOffre
	 * @param numeroEntreprise
	 * @param dateDebutStage
	 * @param dateFinStage
	 */
	public OffreDeStage(int numeroOffreDeStage, String descriptionPoste,String etatOffre) {
		this();
		this.numeroOffreDeStage = numeroOffreDeStage;
		this.descriptionPoste = descriptionPoste;
		this.etatOffre = etatOffre;
	}
	
	public OffreDeStage(int numeroOffreDeStage){
		this(numeroOffreDeStage,"","");
	}

	/**
	 * @return the numeroOffreDeStage
	 */
	public int getNumeroOffreDeStage() {
		return numeroOffreDeStage;
	}

	/**
	 * @param numeroOffreDeStage the numeroOffreDeStage to set
	 */
	public void setNumeroOffreDeStage(int numeroOffreDeStage) {
		this.numeroOffreDeStage = numeroOffreDeStage;
	}

	/**
	 * @return the descriptionPoste
	 */
	public String getDescriptionPoste() {
		return descriptionPoste;
	}

	/**
	 * @param descriptionPoste the descriptionPoste to set
	 */
	public void setDescriptionPoste(String descriptionPoste) {
		this.descriptionPoste = descriptionPoste;
	}

	/**
	 * @return the etatOffre
	 */
	public String getEtatOffre() {
		return etatOffre;
	}

	/**
	 * @param etatOffre the etatOffre to set
	 */
	public void setEtatOffre(String etatOffre) {
		this.etatOffre = etatOffre;
	}

	/**
	 * @return the dateDebutStage
	 */
	public Jours getDateDebutStage() {
		return dateDebutStage;
	}

	/**
	 * @param dateDebutStage the dateDebutStage to set
	 */
	public void setDateDebutStage(Jours dateDebutStage) {
		this.dateDebutStage = dateDebutStage;
	}

	/**
	 * @return the dateFinStage
	 */
	public Jours getDateFinStage() {
		return dateFinStage;
	}

	/**
	 * @param dateFinStage the dateFinStage to set
	 */
	public void setDateFinStage(Jours dateFinStage) {
		this.dateFinStage = dateFinStage;
	}

	public Entreprise getMonEntreprise() {
		return monEntreprise;
	}

	public void setMonEntreprise(Entreprise monEntreprise) {
		this.monEntreprise = monEntreprise;
	}

	public ConventionStage getMaConvention() {
		return maConvention;
	}

	public void setMaConvention(ConventionStage maConvention) {
		this.maConvention = maConvention;
	}
   
}
