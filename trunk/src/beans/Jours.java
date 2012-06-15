package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class Jours implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5361119094901968264L;
	private GregorianCalendar date;
	private Periode maPeriode;
	private List<Examen> mesExamens = new ArrayList<Examen>();
	private List<Reunion> mesReunions = new ArrayList<Reunion>();
	private List<OffreDeStage> mesOffresDebut = new ArrayList<OffreDeStage>();
	private List<OffreDeStage> mesOffresFin = new ArrayList<OffreDeStage>();
	private List<Indisponibilite> mesIndispos = new ArrayList<Indisponibilite>();
	private List<Creneau> mesCreneaux = new ArrayList<Creneau>();

	/**
	 * 
	 */
	public Jours() {
		super();
	}

	/**
	 * @param date
	 */
	public Jours(GregorianCalendar date) {
		this();
		this.setDate(date);
	}
	
	/**
	 * @return the date
	 */
	public GregorianCalendar getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public List<Examen> getMesExamens() {
		return mesExamens;
	}

	public void setMesExamens(List<Examen> mesExamens) {
		this.mesExamens = mesExamens;
	}

	public List<Reunion> getMesReunions() {
		return mesReunions;
	}

	public void setMesReunions(List<Reunion> mesReunions) {
		this.mesReunions = mesReunions;
	}

	public List<OffreDeStage> getMesOffresDebut() {
		return mesOffresDebut;
	}

	public void setMesOffresDebut(List<OffreDeStage> mesOffresDebut) {
		this.mesOffresDebut = mesOffresDebut;
	}

	public List<OffreDeStage> getMesOffresFin() {
		return mesOffresFin;
	}

	public void setMesOffresFin(List<OffreDeStage> mesOffresFin) {
		this.mesOffresFin = mesOffresFin;
	}

	public Periode getMaPeriode() {
		return maPeriode;
	}

	public void setMaPeriode(Periode maPeriode) {
		this.maPeriode = maPeriode;
	}

	public List<Indisponibilite> getMesIndispos() {
		return mesIndispos;
	}

	public void setMesIndispos(List<Indisponibilite> mesIndispos) {
		this.mesIndispos = mesIndispos;
	}

	public List<Creneau> getMesCreneaux() {
		return mesCreneaux;
	}

	public void setMesCreneaux(List<Creneau> mesCreneaux) {
		this.mesCreneaux = mesCreneaux;
	}	
}
