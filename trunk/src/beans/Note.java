package beans;
import java.io.Serializable;


public class Note implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 579434055514961874L;
	private Etudiant monEtudiant;
	private Examen monExamen;
	private double note;
	
	/**
	 * 
	 */
	public Note() {
		super();
	}

	/**
	 * @param numeroEtudiant
	 * @param numeroExamen
	 * @param note
	 */
	public Note(Etudiant monEtudiant, Examen monExamen, double note) {
		this();
		this.monEtudiant = monEtudiant;
		this.monExamen = monExamen;
		this.note = note;
		this.monEtudiant.getMesNotes().add(this);
		this.monExamen.getMesNotes().add(this);
	}


	/**
	 * @return the note
	 */
	public double getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(double note) {
		this.note = note;
	}

	public Etudiant getMonEtudiant() {
		return monEtudiant;
	}

	public void setMonEtudiant(Etudiant monEtudiant) {
		this.monEtudiant = monEtudiant;
	}

	public Examen getMonExamen() {
		return monExamen;
	}

	public void setMonExamen(Examen monExamen) {
		this.monExamen = monExamen;
	}
			
}
