package metier;

import java.util.GregorianCalendar;


public class Enseignant_1 {
    private int NumeroEnseignant;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Telephone;
    private GregorianCalendar DateNaissance;
    private String Login;
    private String PassWord;
	
    public Enseignant_1() {
	}

	public Enseignant_1(int numeroEnseignant, String nom, String prenom,
			String adresse, String telephone, GregorianCalendar dateNaissance,
			String login, String passWord) {
		NumeroEnseignant = numeroEnseignant;
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Telephone = telephone;
		DateNaissance = dateNaissance;
		Login = login;
		PassWord = passWord;
	}

	public int getNumeroEnseignant() {
		return NumeroEnseignant;
	}

	public void setNumeroEnseignant(int numeroEnseignant) {
		NumeroEnseignant = numeroEnseignant;
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
}
