package beansUtilisation;

import java.util.GregorianCalendar;

public class DepassementSemaine {
	// 
	GregorianCalendar gregorianCalendar;
	int nbrMinutes;

	/**
	 * @param gregorianCalendar : semaine de depassement
	 * @param nbrMinutes : temps total de la semaine
	 */
	public DepassementSemaine(GregorianCalendar gregorianCalendar, int nbrMinutes) {
		super();
		this.gregorianCalendar = gregorianCalendar;
		this.nbrMinutes = nbrMinutes;
	}

	/**
	 * @return the gregorianCalendar
	 */
	public GregorianCalendar getG() {
		return gregorianCalendar;
	}

	/**
	 * @param gregorianCalendar the gregorianCalendar to set
	 */
	public void setG(GregorianCalendar gregorianCalendar) {
		this.gregorianCalendar = gregorianCalendar;
	}

	/**
	 * @return the nbrMinutes
	 */
	public int getNbrMinutes() {
		return nbrMinutes;
	}

	/**
	 * @param nbrMinutes the nbrMinutes to set
	 */
	public void setNbrMinutes(int nbrMinutes) {
		this.nbrMinutes = nbrMinutes;
	}
	
	
}
