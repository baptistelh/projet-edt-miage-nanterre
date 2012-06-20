package webservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import beans.Creneau;

public class Event {
	private static int IDENT_AUTO = 0;
	private int id = 0;
	private int cid = 1;
	private String title;
	private int time; 
	private String start;
	private String end;
	private String room;
	private String teacher;
	
	public Event(Creneau c) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		this.id = IDENT_AUTO++;
		this.title = c.getMonEC().getLibelle();
		this.time = c.getDuree();
				
		GregorianCalendar gc = c.getDateCreneau().getDateDuJour();
		int heure = Integer.parseInt(c.getHoraire().split(":")[0]);
		int minute = Integer.parseInt(c.getHoraire().split(":")[1]);

		gc.add(Calendar.HOUR,heure);
		gc.add(Calendar.MINUTE, minute);
		
		this.start = df.format(gc.getTime());
		gc.add(Calendar.MINUTE, c.getDuree());
		this.end = df.format(gc.getTime());
		
		this.room = c.getMaSalle().getNumeroSalle();
		this.teacher = c.getMonEnseignant().getPrenom()+" "+c.getMonEnseignant().getNom();
		
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
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

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
}
