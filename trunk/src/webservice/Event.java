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

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(2011, 11, 15,13, 12);
		System.out.println(gc.getTime().toString());
		System.out.println(gc.getTime());
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
}
