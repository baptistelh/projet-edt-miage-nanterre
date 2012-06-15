package beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class Candidat implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -191382832421990549L;
	private int numeroCandidat;
    private String nom;
    private String prenom;
    private String adresse;
	private String telephone;
	private GregorianCalendar dateNaissance;
    private String login;
    private String password;
    private GregorianCalendar date;
    private boolean etatDuDossier;
    private String mail;
    private Etudiant monEtudiant;
    private List<Postule> mesPostulations = new ArrayList<Postule>();
	
	/**
	 * 
	 */
	public Candidat() {
		super();
	}
	
    /**
	 * @param numeroCandidat
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param dateNaissance
	 * @param login
	 * @param passWord
	 * @param date
	 * @param etatDuDossier
	 * @param mail
	 */
	public Candidat(int numeroCandidat, String nom, String prenom,
			String adresse, String telephone, GregorianCalendar dateNaissance,
			String login, String password, GregorianCalendar date,
			boolean etatDuDossier, String mail) {
		this();
		this.numeroCandidat = numeroCandidat;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
		this.login = login;
		this.password = password;
		this.date = date;
		this.etatDuDossier = etatDuDossier;
		this.mail = mail;
	}

	public Candidat(int numeroCandidat){
		this(numeroCandidat,"","","","",new GregorianCalendar(),"","",new GregorianCalendar(),false,"");
	}
	/**
	 * @return the numeroCandidat
	 */
	public int getNumeroCandidat() {
		return numeroCandidat;
	}

	/**
	 * @param numeroCandidat the numeroCandidat to set
	 */
	public void setNumeroCandidat(int numeroCandidat) {
		this.numeroCandidat = numeroCandidat;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the dateNaissance
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(GregorianCalendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the passWord
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the etatDuDossier
	 */
	public boolean isEtatDuDossier() {
		return etatDuDossier;
	}

	/**
	 * @param etatDuDossier the etatDuDossier to set
	 */
	public void setEtatDuDossier(boolean etatDuDossier) {
		this.etatDuDossier = etatDuDossier;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	public Etudiant getMonEtudiant() {
		return monEtudiant;
	}

	public void setMonEtudiant(Etudiant monEtudiant) {
		this.monEtudiant = monEtudiant;
	}

	public List<Postule> getMesPostulations() {
		return mesPostulations;
	}

	public void setMesPostulations(List<Postule> mesPostulations) {
		this.mesPostulations = mesPostulations;
	}
 
	
}
