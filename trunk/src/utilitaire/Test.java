package utilitaire;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;


public class Test {
	private Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		GenererJourFeries gen = new GenererJourFeries();
		SimpleDateFormat si = new SimpleDateFormat(("dd/MM/yyyy"));
		List<GregorianCalendar> joursFeries = gen.genererJoursFeries();
        for(GregorianCalendar g : joursFeries) {
        	System.out.print(si.format(g.getTime()));
        }	
	}
}