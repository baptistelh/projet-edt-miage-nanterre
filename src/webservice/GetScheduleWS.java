package webservice;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.json.JSONConfiguration;

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
	
	@GET @Path("/toto")
	@Produces(MediaType.APPLICATION_JSON)
	public CalendarTest getScheduleTest(@DefaultValue("06-10-2012") @QueryParam("start") String start,@DefaultValue("06-16-2012") @QueryParam("end") String end,@DefaultValue("1") @QueryParam("page") int page,@DefaultValue("25") @QueryParam("limit") int limit) {
		
		//JSONConfiguration.natural().build();
		JSONConfiguration.natural().rootUnwrapping(false).build();
		return new CalendarTest(new EventTest());
	}
	
	@GET @Path("urlavecparam/{paramtest}")
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
	
	@GET @Path("Room")
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