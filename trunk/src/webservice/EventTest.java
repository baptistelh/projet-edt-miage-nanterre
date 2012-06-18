package webservice;



public class EventTest {
	
	private int id = 1001;
	private int cid = 1;
	private String title = "Vacation";
	private String start = "18/06/2012 03:05:01 PM GMT-0600";
	private String end = "18/06/2012 04:05:01 PM GMT-0600";
	private String notes = "Have fun";
	
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
