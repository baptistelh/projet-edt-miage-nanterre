package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Semestre implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7879375760488149641L;
	private int numeroSemestre;
    private String libelle;
    private List<UE> mesUE = new ArrayList<UE>();
    private List<Periode> mesPeriodes = new ArrayList<Periode>();
	
    public Semestre() {
    	super();
	}

	public Semestre(int numeroSemestre, String libelle) {
		this();
		this.numeroSemestre = numeroSemestre;
		this.libelle = libelle;
	}
	
	public Semestre(int numeroSemestre){
		this(numeroSemestre,"");
	}

	public int getNumeroSemestre() {
		return numeroSemestre;
	}

	public void setNumeroSemestre(int numeroSemestre) {
		this.numeroSemestre = numeroSemestre;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<UE> getMesUE() {
		return mesUE;
	}

	public void setMesUE(List<UE> mesUE) {
		this.mesUE = mesUE;
	}

	public List<Periode> getMesPeriodes() {
		return mesPeriodes;
	}

	public void setMesPeriodes(List<Periode> mesPeriodes) {
		this.mesPeriodes = mesPeriodes;
	}
}
