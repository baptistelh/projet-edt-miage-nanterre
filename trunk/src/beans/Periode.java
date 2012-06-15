package beans;
import java.io.Serializable;


public class Periode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3783245261993784176L;
	private int numeroPeriode;
	private Jours dateDebut, dateFin;
	private Semestre monSemestre;
	

	public Periode() {
		super();
	}

	public Periode(int numeroPeriode) {
		this();
		this.setNumeroPeriode(numeroPeriode);
	}
	


	public int getNumeroPeriode() {
		return numeroPeriode;
	}

	public void setNumeroPeriode(int numeroPeriode) {
		this.numeroPeriode = numeroPeriode;
	}

	public Jours getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Jours dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Jours getDateFin() {
		return dateFin;
	}

	public void setDateFin(Jours dateFin) {
		this.dateFin = dateFin;
	}

	public Semestre getMonSemestre() {
		return monSemestre;
	}

	public void setMonSemestre(Semestre monSemestre) {
		this.monSemestre = monSemestre;
	}
}
