package webservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import beans.Creneau;

public class Event {
	
	private int id = 0;
	private int cid = 1;
	private String title;
//	private GregorianCalendar startNotFormat = new GregorianCalendar(2012, 5, 19, 10, 00);
//	private String start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startNotFormat.getTime());
//	private GregorianCalendar endNotFormat = new GregorianCalendar(2012, 5, 19, 12, 00);
//	private String end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(endNotFormat.getTime());
	private String start;
	private String end;
	private String notes = "Have fun";
	private boolean ad = false;
	
	public Event(Creneau c) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		this.title = c.getMonEC().getLibelle() + c.getMaSalle().getNumSalle() + c.getMonEnseignant().getNom();
		
		GregorianCalendar gc = c.getDateCreneau().getDate();
		int heure = Integer.parseInt(c.getHoraire().split(":")[0]);
		int minute = Integer.parseInt(c.getHoraire().split(":")[1]);

		gc.add(Calendar.HOUR,heure);
		gc.add(Calendar.MINUTE, minute);
		
		this.start = df.format(gc.getTime());
		gc.add(Calendar.MINUTE, c.getDuree());
		this.end = df.format(gc.getTime());
		
		this.id++;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean isAd() {
		return ad;
	}

	public void setAd(boolean ad) {
		this.ad = ad;
	}
	
	
	
}
