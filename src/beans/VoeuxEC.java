package beans;
import java.io.Serializable;


public class VoeuxEC implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3710604296274695060L;
	private boolean ChoixEC;
	private EC monEC;
	private Enseignant monEnseignant;

	public VoeuxEC() {
		super();
	}

	public VoeuxEC(EC monEC, Enseignant monEnseignant,boolean choixEC) {
		this();
		this.monEC = monEC;
		this.monEnseignant = monEnseignant;
		ChoixEC = choixEC;
		this.monEC.getMesVoeuxEC().add(this);
		this.monEnseignant.getMesVoeuxEC().add(this);		
	}

	public boolean isChoixEC() {
		return ChoixEC;
	}

	public void setChoixEC(boolean choixEC) {
		ChoixEC = choixEC;
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
}
