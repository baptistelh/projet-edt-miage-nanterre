package beans;
import java.io.Serializable;


public class Service implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3070881661530192376L;
	private int nbHeures;
	private EC monEC;
	private Enseignant monEnseignant;
	private Type monType;

	public Service() {
		super();
	}

	public Service(EC monEC, Enseignant monEnseignant, Type monType, int nbHeures) {
		this();
		this.nbHeures = nbHeures;
		this.monEC = monEC;
		this.monEnseignant = monEnseignant;
		this.monType = monType;
		this.monEC.getMesServices().add(this);
		this.monEnseignant.getMesServices().add(this);
		this.monType.getMesServices().add(this);
	}

	public int getNbHeures() {
		return nbHeures;
	}

	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}

	public EC getMonEC() {
		return monEC;
	}

	public void setMonEC(EC monEC) {
		this.monEC = monEC;
	}

	public Enseignant getMonEnseignant() {
		return monEnseignant;
	}

	public void setMonEnseignant(Enseignant monEnseignant) {
		this.monEnseignant = monEnseignant;
	}

	public Type getMonType() {
		return monType;
	}

	public void setMonType(Type monType) {
		this.monType = monType;
	}
}
