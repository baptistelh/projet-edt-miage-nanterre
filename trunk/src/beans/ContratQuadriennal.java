import java.util.GregorianCalendar;

public class ContratQuadriennal {
    private int NumeroContrat;
    private GregorianCalendar date;
    private String Duree;
	
    public ContratQuadriennal() {
	}

	public ContratQuadriennal(int numeroContrat, GregorianCalendar date,
			String duree) {
		NumeroContrat = numeroContrat;
		this.date = date;
		Duree = duree;
	}

	public int getNumeroContrat() {
		return NumeroContrat;
	}

	public void setNumeroContrat(int numeroContrat) {
		NumeroContrat = numeroContrat;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public String getDuree() {
		return Duree;
	}

	public void setDuree(String duree) {
		Duree = duree;
	}
}
