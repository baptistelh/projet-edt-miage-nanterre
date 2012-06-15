package beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class ContratQuadriennal implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7700219818451278165L;
	private int numeroContrat;
    private GregorianCalendar date;
    private String duree;
    private List<Formation> mesFormations = new ArrayList<Formation>();
	
    public ContratQuadriennal() {
    	super();
	}
    
	public ContratQuadriennal(int numeroContrat, GregorianCalendar date,
			String duree) {
		this();
		this.numeroContrat = numeroContrat;
		this.date = date;
		this.duree = duree;
	}
	
	public ContratQuadriennal(int numeroContrat){
		this(numeroContrat, new GregorianCalendar(),"");
	}

	public int getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(int numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public List<Formation> getMesFormations() {
		return mesFormations;
	}

	public void setMesFormations(List<Formation> mesFormations) {
		this.mesFormations = mesFormations;
	}
}
