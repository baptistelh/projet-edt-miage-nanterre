package beans;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Postule implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3881695585209496568L;
	private GregorianCalendar date;
    private String commentaire;
    private GregorianCalendar dateAudition;
    private Candidat monCandidat;
    private Promotion maPromotion;
    private EtatDossier monEtat;
	
    /**
	 * 
	 */
	public Postule() {
		super();
	}

	/**
	 * @param date
	 * @param commentaire
	 * @param dateAudition
	 * @param numeroEtudiant
	 * @param numeroPromotion
	 * @param numeroEtat
	 */
	public Postule(Candidat monCandidat, Promotion maPromotion, EtatDossier monEtat, GregorianCalendar date, String commentaire,GregorianCalendar dateAudition) {
		this();
		this.date = date;
		this.commentaire = commentaire;
		this.dateAudition = dateAudition;
		this.monCandidat = monCandidat;
		this.maPromotion = maPromotion;
		this.monEtat = monEtat;
		this.monCandidat.getMesPostulations().add(this);
		this.maPromotion.getMesPostulations().add(this);
		this.monEtat.getMesPostulations().add(this);
	}

	/**
	 * @return the date
	 */
	public GregorianCalendar getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	/**
	 * @return the dateAudition
	 */
	public GregorianCalendar getDateAudition() {
		return dateAudition;
	}

	/**
	 * @param dateAudition the dateAudition to set
	 */
	public void setDateAudition(GregorianCalendar dateAudition) {
		this.dateAudition = dateAudition;
	}

	public Candidat getMonCandidat() {
		return monCandidat;
	}

	public void setMonCandidat(Candidat monCandidat) {
		this.monCandidat = monCandidat;
	}

	public Promotion getMaPromotion() {
		return maPromotion;
	}

	public void setMaPromotion(Promotion maPromotion) {
		this.maPromotion = maPromotion;
	}

	public EtatDossier getMonEtat() {
		return monEtat;
	}

	public void setMonEtat(EtatDossier monEtat) {
		this.monEtat = monEtat;
	}
}
