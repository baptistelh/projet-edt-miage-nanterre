package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Salle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1368414132801708425L;
	private String numSalle ;
	private int capacite ;
	private String lieu ;
	private List<Reunion> mesReunions = new ArrayList<Reunion>();
	private List<Creneau> mesCreneaux = new ArrayList<Creneau>();
	
	public Salle() {
		super();
	}
	
	public Salle(String numSalle, int capacite, String lieu) {
		this();
		this.numSalle = numSalle;
		this.capacite = capacite;
		this.lieu = lieu;
	}
	
	public Salle(String numSalle){
		this(numSalle,0,"");
	}
		
	public String getNumSalle() {
		return numSalle;
	}
	public void setNumSalle(String numSalle) {
		this.numSalle = numSalle;
	}
	
	public int getCapacite() {
		return capacite;
	}
	
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	public String getLieu() {
		return lieu;
	}
	
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public List<Reunion> getMesReunions() {
		return mesReunions;
	}

	public void setMesReunions(List<Reunion> mesReunions) {
		this.mesReunions = mesReunions;
	}

	public List<Creneau> getMesCreneaux() {
		return mesCreneaux;
	}

	public void setMesCreneaux(List<Creneau> mesCreneaux) {
		this.mesCreneaux = mesCreneaux;
	}
}
