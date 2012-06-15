package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Promotion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3759307243789777271L;
	private int numeroPromotion;
	private List<Etudiant> mesEtudiants = new ArrayList<Etudiant>();
	private Formation maFormation;
	private List<Postule> mesPostulations = new ArrayList<Postule>();
	private List<Promotion_Historisee> monHistorique = new ArrayList<Promotion_Historisee>();
	
	/**
	 * 
	 */
	public Promotion() {
		super();
	}

	/**
	 * @param numeroPromotion
	 * @param numeroFormation
	 */
	public Promotion(int numeroPromotion) {
		this();
		this.numeroPromotion = numeroPromotion;
	}
	
	/**
	 * @return the numeroPromotion
	 */
	public int getNumeroPromotion() {
		return numeroPromotion;
	}

	/**
	 * @param numeroPromotion the numeroPromotion to set
	 */
	public void setNumeroPromotion(int numeroPromotion) {
		this.numeroPromotion = numeroPromotion;
	}

	public List<Etudiant> getMesEtudiants() {
		return mesEtudiants;
	}

	public void setMesEtudiants(List<Etudiant> mesEtudiants) {
		this.mesEtudiants = mesEtudiants;
	}

	public Formation getMaFormation() {
		return maFormation;
	}

	public void setMaFormation(Formation maFormation) {
		this.maFormation = maFormation;
	}

	public List<Postule> getMesPostulations() {
		return mesPostulations;
	}

	public void setMesPostulations(List<Postule> mesPostulations) {
		this.mesPostulations = mesPostulations;
	}

	public List<Promotion_Historisee> getMonHistorique() {
		return monHistorique;
	}

	public void setMonHistorique(List<Promotion_Historisee> monHistorique) {
		this.monHistorique = monHistorique;
	}
	
}
