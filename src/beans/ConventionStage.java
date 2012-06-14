package beans;
import java.util.GregorianCalendar;


public class ConventionStage {
    private int NumeroConvention;
    private GregorianCalendar DateSignatureC;
    private int DureeC;
	
    public ConventionStage(){
    	
    }
    
    public ConventionStage(int numeroConvention, GregorianCalendar dateSignatureC, int dureeC) {
		NumeroConvention = numeroConvention;
		DateSignatureC = dateSignatureC;
		DureeC = dureeC;
	}

	public int getNumeroConvention() {
		return NumeroConvention;
	}

	public void setNumeroConvention(int numeroConvention) {
		NumeroConvention = numeroConvention;
	}

	public GregorianCalendar getDateSignatureC() {
		return DateSignatureC;
	}

	public void setDateSignatureC(GregorianCalendar dateSignatureC) {
		DateSignatureC = dateSignatureC;
	}

	public int getDureeC() {
		return DureeC;
	}

	public void setDureeC(int dureeC) {
		DureeC = dureeC;
	}

}
