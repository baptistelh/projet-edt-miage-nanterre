package webservice;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import beans.Creneau;
import beans.EC;

// POJO, no interface no extends

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /getSchedule
@Path("/GetSchedule")
public class GetScheduleWS {
	
	@GET @Path("test/{paramtest}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getSchedule(@PathParam("paramtest") String str) {
		return "le param est "+str;
	}
	
	@GET @Path("/Ec")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromEc() {
		Event e1 = new Event(new Creneau(new GregorianCalendar(2011, 11, 15,
				13, 12), 120), new EC(1, "toto", 4));
		Event e2 = new Event(new Creneau(new GregorianCalendar(2012, 5, 14, 1,
				00), 90), new EC(2, "titi", 2));
		
		List<Event> listEvt = new ArrayList<Event>();
		listEvt.add(e1);
		listEvt.add(e2);
		return listEvt;
	}
	
	@GET @Path("/Teacher")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromTeacher() {
		Event e1 = new Event(new Creneau(new GregorianCalendar(2011, 11, 15,
				13, 12), 120), new EC(1, "toto", 4));
		Event e2 = new Event(new Creneau(new GregorianCalendar(2012, 5, 14, 1,
				00), 90), new EC(2, "titi", 2));
		
		List<Event> listEvt = new ArrayList<Event>();
		listEvt.add(e1);
		listEvt.add(e2);
		return listEvt;
	}
	
	@GET @Path("/Promotion")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromPromotion() {
		Event e1 = new Event(new Creneau(new GregorianCalendar(2011, 11, 15,
				13, 12), 120), new EC(1, "toto", 4));
		Event e2 = new Event(new Creneau(new GregorianCalendar(2012, 5, 14, 1,
				00), 90), new EC(2, "titi", 2));
		
		List<Event> listEvt = new ArrayList<Event>();
		listEvt.add(e1);
		listEvt.add(e2);
		return listEvt;
	}
	
	@GET @Path("/Room")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromRoom() {
		Event e1 = new Event(new Creneau(new GregorianCalendar(2011, 11, 15,
				13, 12), 120), new EC(1, "toto", 4));
		Event e2 = new Event(new Creneau(new GregorianCalendar(2012, 5, 14, 1,
				00), 90), new EC(2, "titi", 2));
		
		List<Event> listEvt = new ArrayList<Event>();
		listEvt.add(e1);
		listEvt.add(e2);
		return listEvt;
	}
	
	
	
}