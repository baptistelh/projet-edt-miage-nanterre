package webservice;

import java.util.ArrayList;
import java.util.List;

public class CalendarTest {
	
	private List <EventTest> evts = new ArrayList<EventTest>();
	
	
	public CalendarTest(EventTest et){
		this.evts.add(et);
	}

	public List <EventTest> getEvts() {
		return evts;
	}

	public void setEvts(List <EventTest> evts) {
		this.evts = evts;
	}

}
