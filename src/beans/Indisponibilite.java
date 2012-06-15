package beans;
import java.io.Serializable;


public class Indisponibilite implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5892609409271626866L;
    private Enseignant monEnseignant;
    private Jours date;
    private int demiJournee;
    private int poids;
	
    public Indisponibilite() {
    	super();
	}

	public Indisponibilite(Enseignant monEnseignant, Jours date, int demiJournee, int poids) {
		this();
		this.demiJournee = demiJournee;
		this.poids = poids;		
		this.monEnseignant = monEnseignant;
		this.date = date;
		this.monEnseignant.getMesIndispos().add(this);
		this.date.getMesIndispos().add(this);
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getDemiJournee() {
		return demiJournee;
	}

	public void setDemiJournee(int demiJournee) {
		this.demiJournee = demiJournee;
	}

	public Enseignant getMonEnseignant() {
		return monEnseignant;
	}

	public void setMonEnseignant(Enseignant monEnseignant) {
		this.monEnseignant = monEnseignant;
	}

	public Jours getdate() {
		return date;
	}

	public void setdate(Jours date) {
		this.date = date;
	}
}
