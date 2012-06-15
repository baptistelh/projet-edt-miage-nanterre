package beans;
import java.io.Serializable;


public class Necessite implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7425488625471025037L;
	private int nbHeures_maquette;
	private EC monEC;
	private Type monType;

	public Necessite() {
		super();
	}

	public Necessite(EC monEC, Type monType, int nbHeures_maquette) {
		this();
		this.nbHeures_maquette = nbHeures_maquette;
		this.monEC = monEC;
		this.monType = monType;
		this.monEC.getMesNecessites().add(this);
		this.monType.getMesNecessites().add(this);
	}

	public int getNbHeures_maquette() {
		return nbHeures_maquette;
	}

	public void setNbHeures_maquette(int nbHeures_maquette) {
		this.nbHeures_maquette = nbHeures_maquette;
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
}
