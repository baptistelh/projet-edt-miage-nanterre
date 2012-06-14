import java.util.GregorianCalendar;


public class Candidat {
    private int NumeroCandidat;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Telephone;
    private GregorianCalendar DateNaissance;
    private String Login;
    private String PassWord;
    private GregorianCalendar Date;
    private boolean etatDuDossier;
    private String Mail;
	
    public Candidat(){
    	
    }
    
    public Candidat(int numeroCandidat, String nom, String prenom,
			String adresse, String telephone, GregorianCalendar dateNaissance,
			String login, String passWord, GregorianCalendar date,
			boolean etatDuDossier, String mail) {
		NumeroCandidat = numeroCandidat;
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Telephone = telephone;
		DateNaissance = dateNaissance;
		Login = login;
		PassWord = passWord;
		Date = date;
		etatDuDossier = etatDuDossier;
		Mail = mail;
	}

	public int getNumeroCandidat() {
		return NumeroCandidat;
	}
	public void setNumeroCandidat(int numeroCandidat) {
		NumeroCandidat = numeroCandidat;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public GregorianCalendar getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(GregorianCalendar dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public GregorianCalendar getDate() {
		return Date;
	}
	public void setDate(GregorianCalendar date) {
		Date = date;
	}
	public boolean isetatDuDossier() {
		return etatDuDossier;
	}
	public void setetatDuDossier(boolean etatDuDossier) {
		etatDuDossier = etatDuDossier;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
}
