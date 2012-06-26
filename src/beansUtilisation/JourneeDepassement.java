package beansUtilisation;

import java.util.GregorianCalendar;

public class JourneeDepassement {
	private GregorianCalendar date;
	private Integer duree;
	
	
	public JourneeDepassement(GregorianCalendar date, Integer duree) {
		super();
		this.date = date;
		this.duree = duree;
	}

	
	public GregorianCalendar getDate() {
		return date;
	}
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	

}
