package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class UE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3399982917151817441L;
	private int numeroUE;
	private Formation maFormation;
	private List<EC> mesEC = new ArrayList<EC>();
	private Semestre monSemestre;

	public UE() {
		super();
	}

	public UE(int numeroUE, Formation maFormation) {
		this();
		this.numeroUE = numeroUE;
		this.setMaFormation(maFormation);
	}

	public int getNumeroUE() {
		return numeroUE;
	}

	public void setNumeroUE(int numeroUE) {
		this.numeroUE = numeroUE;
	}

	public Formation getMaFormation() {
		return maFormation;
	}

	public void setMaFormation(Formation maFormation) {
		this.maFormation = maFormation;
	}

	public List<EC> getMesEC() {
		return mesEC;
	}

	public void setMesEC(List<EC> mesEC) {
		this.mesEC = mesEC;
	}

	public Semestre getMonSemestre() {
		return monSemestre;
	}

	public void setMonSemestre(Semestre monSemestre) {
		this.monSemestre = monSemestre;
	}
}
