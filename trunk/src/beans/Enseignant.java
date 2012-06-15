package beans;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class Enseignant {
    private int numeroEnseignant;
    private TypePoste monPoste;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private GregorianCalendar dateNaissance;
    private String login;
    private String password;
    private List<VoeuxEC> mesVoeuxEC = new ArrayList<VoeuxEC>();
    private List<Indisponibilite> mesIndispos = new ArrayList<Indisponibilite>();
    private List<Creneau> mesCreneaux = new ArrayList<Creneau>();
    private List<Service> mesServices = new ArrayList<Service>();
	
    public Enseignant() {
    	super();
	}

	public Enseignant(int numeroEnseignant, String nom, String prenom,String adresse, String telephone, GregorianCalendar dateNaissance,String login, String password) {
		this();
		this.setNumeroEnseignant(numeroEnseignant);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAdresse(adresse);
		this.setTelephone(telephone);
		this.setDateNaissance(dateNaissance);
		this.setLogin(login);
		this.setPassword(password);
	}

	public Enseignant(int numeroEnseignant) {
		this(numeroEnseignant, "","", "", "", new GregorianCalendar(), "", "");
	}
		
	public int getNumeroEnseignant() {
		return numeroEnseignant;
	}

	public void setNumeroEnseignant(int numeroEnseignant) {
		this.numeroEnseignant = numeroEnseignant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(GregorianCalendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<VoeuxEC> getMesVoeuxEC() {
		return mesVoeuxEC;
	}

	public void setMesVoeuxEC(List<VoeuxEC> mesVoeuxEC) {
		this.mesVoeuxEC = mesVoeuxEC;
	}

	public TypePoste getMonPoste() {
		return monPoste;
	}

	public void setMonPoste(TypePoste monPoste) {
		this.monPoste = monPoste;
	}

	public List<Indisponibilite> getMesIndispos() {
		return mesIndispos;
	}

	public void setMesIndispos(List<Indisponibilite> mesIndispos) {
		this.mesIndispos = mesIndispos;
	}

	public List<Creneau> getMesCreneaux() {
		return mesCreneaux;
	}

	public void setMesCreneaux(List<Creneau> mesCreneaux) {
		this.mesCreneaux = mesCreneaux;
	}

	public List<Service> getMesServices() {
		return mesServices;
	}

	public void setMesServices(List<Service> mesServices) {
		this.mesServices = mesServices;
	}
}
