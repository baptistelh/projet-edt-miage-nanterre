package webservice;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import beans.Creneau;

// POJO, no interface no extends

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> sayJsonHello() {
		Event e1 = new Event(new Creneau(new GregorianCalendar(2011,11,15,13,12), 120));
		Event e2 = new Event(new Creneau(new GregorianCalendar(2012,5,14,1,00),90));
		List<Event> listEvt = new ArrayList<Event>();
		
		listEvt.add(e1);
		listEvt.add(e2);
		
		return listEvt;
	}
}