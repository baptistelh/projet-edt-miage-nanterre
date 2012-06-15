package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class EtatDossier implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -2236387729441767617L;
	private int numeroEtat;
    private String etat;
    private List<Postule> mesPostulations = new ArrayList<Postule>();
	
    /**
	 * 
	 */
	public EtatDossier() {
		super();
	}

	/**
	 * @param numeroEtat
	 * @param etat
	 */
	public EtatDossier(int numeroEtat, String etat) {
		this();
		this.numeroEtat = numeroEtat;
		this.etat = etat;
	}

	/**
	 * @return the numeroEtat
	 */
	public int getNumeroEtat() {
		return numeroEtat;
	}

	/**
	 * @param numeroEtat the numeroEtat to set
	 */
	public void setNumeroEtat(int numeroEtat) {
		this.numeroEtat = numeroEtat;
	}

	/**
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * @param etat the etat to set
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	public List<Postule> getMesPostulations() {
		return mesPostulations;
	}

	public void setMesPostulations(List<Postule> mesPostulations) {
		this.mesPostulations = mesPostulations;
	}
	
}
