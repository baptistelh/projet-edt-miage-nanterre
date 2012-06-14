package webservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import beans.Creneau;
import beans.EC;
import beans.Promotion;

public class Event {
	private String title;
	private String start;
	private String end;
	
	public Event(Creneau c, EC ec) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		this.title = ec.getLibelle();
		this.start = "\'"+df.format(c.getHoraire().getTime())+"\'";
		c.getHoraire().add(Calendar.MINUTE, c.getDuree());
		this.end = "\'"+df.format(c.getHoraire().getTime())+"\'";
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
