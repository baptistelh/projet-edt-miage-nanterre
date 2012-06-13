package metier;


public class Entreprise {
    private int NumeroEntreprise;
    private String Nom;
    private String Adresse;
    private String Telephone;
    private String Mail;
    private String Login;
    private String Pwd;
	
    public Entreprise() {
	}

	public Entreprise(int numeroEntreprise, String nom, String adresse,
			String telephone, String mail, String login, String pwd) {
		NumeroEntreprise = numeroEntreprise;
		Nom = nom;
		Adresse = adresse;
		Telephone = telephone;
		Mail = mail;
		Login = login;
		Pwd = pwd;
	}

	public int getNumeroEntreprise() {
		return NumeroEntreprise;
	}

	public void setNumeroEntreprise(int numeroEntreprise) {
		NumeroEntreprise = numeroEntreprise;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
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

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}
}
