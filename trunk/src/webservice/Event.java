package webservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import beans.Creneau;

public class Event {
	private String title;
	private String start;
	private String end;
	
	//pour un EC
	public Event(Creneau c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		this.title = c.getMonEC().getLibelle() + c.getMaSalle().getNumSalle() + c.getMonEnseignant().getNom();
		
		
		GregorianCalendar gc = c.getDateCreneau().getDate();
		int heure = Integer.parseInt(c.getHoraire().split(":")[0]);
		int minute = Integer.parseInt(c.getHoraire().split(":")[1]);

		gc.add(Calendar.HOUR,heure);
		gc.add(Calendar.MINUTE, minute);
		
		this.start = "\'"+df.format(gc.getTime())+"\'";
		gc.add(Calendar.MINUTE, c.getDuree());
		this.end = "\'"+df.format(gc.getTime())+"\'";
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
