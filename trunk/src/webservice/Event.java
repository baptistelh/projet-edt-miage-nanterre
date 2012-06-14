package webservice;

import java.util.Calendar;
import java.util.GregorianCalendar;

import beans.Creneau;
import beans.EC;
import beans.Promotion;

public class Event {
//	private int year1;
//	private int mounth1;
//	private int date1;
//	private int hour1;
//	private int minute1;
//	
//	private int year2;
//	private int mounth2;
//	private int date2;
//	private int hour2;
//	private int minute2;
	
	private String title;
	private String start;
	private String end;
	
	
	public Event(Creneau c, EC ec) {
		int year1 = c.getHoraire().get(Calendar.YEAR);
		int mounth1 = c.getHoraire().get(Calendar.MONTH)+1;
		int date1 = c.getHoraire().get(Calendar.DAY_OF_MONTH);
		int hour1 = c.getHoraire().get(Calendar.HOUR_OF_DAY);
		int minute1 = c.getHoraire().get(Calendar.MINUTE);
		
		int h = c.getDuree()/60;
		int m = c.getDuree()%60;
				
		int year2 = c.getHoraire().get(Calendar.YEAR);
		int mounth2 = c.getHoraire().get(Calendar.MONTH)+1;
		int date2 = c.getHoraire().get(Calendar.DAY_OF_MONTH);
		int hour2 = c.getHoraire().get(Calendar.HOUR_OF_DAY)+h;
		int minute2 = c.getHoraire().get(Calendar.MINUTE)+m;
		
		this.title = ec.getLibelle();
		this.start = "\'"+date1+"/"+mounth1+"/"+year1+" "+hour1+":"+minute1+"\'";
		this.end = "\'"+date2+"/"+mounth2+"/"+year2+" "+hour2+":"+minute2+"\'";
	}

	
}
