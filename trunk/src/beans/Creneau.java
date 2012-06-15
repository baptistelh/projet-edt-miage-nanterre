package beans;
import java.io.Serializable;


public class Creneau implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1130222760201225781L;
	private String horaire;
    private int duree;
    private EC monEC;
    private Type monType;
    private Enseignant monEnseignant;
    private Salle maSalle;
    private Jours date;
	
    public Creneau() {
    	super();
	}

	public Creneau(Enseignant monEnseignant, Salle maSalle, EC monEC, Type monType, String horaire, int duree) {
		this();
		this.horaire = horaire;
		this.duree = duree;
		this.monEnseignant = monEnseignant;
		this.maSalle = maSalle;
		this.monEC = monEC;
		this.monType = monType;
		this.monEnseignant.getMesCreneaux().add(this);
		this.maSalle.getMesCreneaux().add(this);
		this.monEC.getMesCreneaux().add(this);
		this.monType.getMesCreneaux().add(this);
	}

	public String getHoraire() {
		return horaire;
	}

	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public EC getMonEC() {
		return monEC;
	}

	public void setMonEC(EC monEC) {
		this.monEC = monEC;
	}

	public Type getMonType() {
		return monType;
	}

	public void setMonType(Type monType) {
		this.monType = monType;
	}

	public Enseignant getMonEnseignant() {
		return monEnseignant;
	}

	public void setMonEnseignant(Enseignant monEnseignant) {
		this.monEnseignant = monEnseignant;
	}

	public Salle getMaSalle() {
		return maSalle;
	}

	public void setMaSalle(Salle maSalle) {
		this.maSalle = maSalle;
	}

	public Jours getDate() {
		return date;
	}

	public void setDate(Jours date) {
		this.date = date;
	}
    
}
