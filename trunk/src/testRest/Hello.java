package testRest;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// POJO, no interface no extends

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {

//	// This method is called if TEXT_PLAIN is request
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String sayPlainTextHello() {
//		return "Hello Jersey";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> sayJsonHello() {
		Event e1 = new Event(new GregorianCalendar(2011,11,15,13,12));
		Event e2 = new Event(new GregorianCalendar(2012,5,14,1,00));
		List<Event> listEvt = new ArrayList<Event>();
		
		listEvt.add(e1);
		listEvt.add(e2);
		
		return listEvt;
	}

//	// This method is called if XML is request
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	public String sayXMLHello() {
//		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
//	}

//	// This method is called if HTML is request
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String sayHtmlHello() {
//		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
//				+ "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
//	}

}
			
