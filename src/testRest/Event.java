package testRest;

public class Event {
	private String nom;
	private String toto;
	
	public Event(String nom, String toto) {
		super();
		this.nom = nom;
		this.toto = toto;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getToto() {
		return toto;
	}
	public void setToto(String toto) {
		this.toto = toto;
	}
	
	
}
