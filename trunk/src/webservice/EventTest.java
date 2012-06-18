package webservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;



public class EventTest {
	
	private int id = 1001;
	private int cid = 1;
	private String title = "Vacation";
	private Date startNotFormat = new Date(2012-1900, 5, 19, 10, 00);
	private String start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startNotFormat);
	private Date endNotFormat = new Date(2012-1900, 5, 19, 11, 00);
	private String end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(endNotFormat);
	private String notes = "Have fun";
	private boolean ad = false;
	
	public EventTest() {
		
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean getAd() {
		return ad;
	}

	public void setAd(boolean ad) {
		this.ad = ad;
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
