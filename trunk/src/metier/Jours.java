package metier;
import java.util.GregorianCalendar;


public class Jours {
	private GregorianCalendar date;

	public Jours() {
	}

	public Jours(GregorianCalendar date) {
		this.date = date;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	
}
