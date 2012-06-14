package webservice;

import java.util.Calendar;
import java.util.GregorianCalendar;

import beans.Creneau;

public class Event {
	private int year1;
	private int mounth1;
	private int date1;
	private int hour1;
	private int minute1;
	
	private int year2;
	private int mounth2;
	private int date2;
	private int hour2;
	private int minute2;
	
	public Event(Creneau c) {
		this.year1 = c.getHoraire().get(Calendar.YEAR);
		this.mounth1 = c.getHoraire().get(Calendar.MONTH)+1;
		this.date1 = c.getHoraire().get(Calendar.DAY_OF_MONTH);
		this.hour1 = c.getHoraire().get(Calendar.HOUR_OF_DAY);
		this.minute1 = c.getHoraire().get(Calendar.MINUTE);
		
		int h = c.getDuree()/60;
		int m = c.getDuree()%60;
		
		
		this.year2 = c.getHoraire().get(Calendar.YEAR);
		this.mounth2 = c.getHoraire().get(Calendar.MONTH)+1;
		this.date2 = c.getHoraire().get(Calendar.HOUR_OF_DAY)+h;
		this.minute2 = c.getHoraire().get(Calendar.MINUTE)+m;
	}

	
}
