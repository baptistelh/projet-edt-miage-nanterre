package webservice;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
private List <Event> evts = new ArrayList<Event>();
	
	
	public Calendar() {
		
	}
	
	
	public void addEvt(Event e) {
		this.evts.add(e);
	}

	public List <Event> getEvts() {
		return evts;
	}

	public void setEvts(List <Event> evts) {
		this.evts = evts;
	}
}
