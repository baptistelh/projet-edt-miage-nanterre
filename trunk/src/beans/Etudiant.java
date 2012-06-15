package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Etudiant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7798026999755813405L;
	private int numeroEtudiant;
	private Candidat monCandidat;
	private List<Promotion> mesPromotions = new ArrayList<Promotion>();
	private List<ContratApprentissage> mesContratsA = new ArrayList<ContratApprentissage>();
	private List<ConventionStage> mesConventions = new ArrayList<ConventionStage>();
	private List<Note> mesNotes = new ArrayList<Note>();
	
	/**
	 * 
	 */
	public Etudiant() {
		super();
	}

	/**
	 * @param numeroEtudiant
	 * @param numeroCandidat
	 */
	public Etudiant(int numeroEtudiant) {
		this();
		this.numeroEtudiant = numeroEtudiant;
	}

	public List<Promotion> getMesPromotions() {
		return mesPromotions;
	}

	public void setMesPromotions(List<Promotion> mesPromotions) {
		this.mesPromotions = mesPromotions;
	}

	/**
	 * @return the numeroEtudiant
	 */
	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}

	/**
	 * @param numeroEtudiant the numeroEtudiant to set
	 */
	public void setNumeroEtudiant(int numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}


	public Candidat getMonCandidat() {
		return monCandidat;
	}

	public void setMonCandidat(Candidat monCandidat) {
		this.monCandidat = monCandidat;
	}

	public List<ContratApprentissage> getMesContratsA() {
		return mesContratsA;
	}

	public void setMesContratsA(List<ContratApprentissage> mesContratsA) {
		this.mesContratsA = mesContratsA;
	}

	public List<ConventionStage> getMesConventions() {
		return mesConventions;
	}

	public void setMesConventions(List<ConventionStage> mesConventions) {
		this.mesConventions = mesConventions;
	}

	public List<Note> getMesNotes() {
		return mesNotes;
	}

	public void setMesNotes(List<Note> mesNotes) {
		this.mesNotes = mesNotes;
	}

}
