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
import beans.Enseignant;
import beans.Formation;
import beans.Jours;
import beans.Salle;
import beans.Type;
import beans.UE;

// POJO, no interface no extends

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /getSchedule
@Path("/GetSchedule")
public class GetScheduleWS {
	
	@GET @Path("/titi")
	@Produces(MediaType.APPLICATION_JSON)
	public Calendar getScheduleTest() {
		
		//JSONConfiguration.natural().build();
		JSONConfiguration.natural().rootUnwrapping(false).build();
		
		Calendar c = new Calendar();
		
		Enseignant e1=new Enseignant(1,"Aragou", "muriel", "1 avenue du meilleur des tuteurs" , "0143855907",new GregorianCalendar(1960,10, 10), "logAragou", "pwdAragou");	
		Salle s1=new Salle("210A", 50, "enferNum1");
		Formation F1=new Formation();
		UE ue1=new UE(1,F1);
		EC ec1= new EC(1, ue1);
		ec1.setLibelle("Genie logiciel");
		Type type1 = new Type(1, "TD");
		Jours j1=new Jours();
		j1.setDateDuJour(new GregorianCalendar(2012, 05, 19));
		Creneau cLundi = new Creneau(e1, s1, ec1, type1, j1, "09:00");
		cLundi.setDuree(90);
		
		Event e = new Event(cLundi);
		c.addEvt(e);
		
		Enseignant e2=new Enseignant(1,"Giroud", "Olivier", "1 avenue des coupeurs d'orange" , "0143855908",new GregorianCalendar(1960,10, 10), "logGiroud", "pwdGiroud");	
		Salle s2=new Salle("210A", 50, "enferNum2");
		Formation F2=new Formation();
		UE ue2=new UE(1,F2);
		EC ec2= new EC(1, ue2);
		ec2.setLibelle("Chauffage de banc");
		Type type2 = new Type(1, "TD"); 
		Jours j2=new Jours();
		j2.setDateDuJour(new GregorianCalendar(2012, 05, 20));
		Creneau cMardi = new Creneau(e2, s2, ec2, type2, j2, "11:00");
		cMardi.setDuree(180);
	
		e = new Event(cMardi);
		c.addEvt(e);
		
		return c;
	}
	
	@GET @Path("/toto")
	@Produces(MediaType.APPLICATION_JSON)
	public CalendarTest getScheduleTest2() {
		
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
		Event e1 = new Event(new Creneau());
		Event e2 = new Event(new Creneau());
		
		List<Event> listEvt = new ArrayList<Event>();
		listEvt.add(e1);
		listEvt.add(e2);
		return listEvt;
	}
	
	@GET @Path("/Teacher")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromTeacher() {
		Event e1 = new Event(new Creneau());
		Event e2 = new Event(new Creneau());
		
		List<Event> listEvt = new ArrayList<Event>();
		listEvt.add(e1);
		listEvt.add(e2);
		return listEvt;
	}
	
	@GET @Path("/Promotion")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromPromotion() {
		
		Event e1 = new Event(new Creneau());
		Event e2 = new Event(new Creneau());
		
		List<Event> listEvt = new ArrayList<Event>();
		listEvt.add(e1);
		listEvt.add(e2);
		return listEvt;
	}
	
	@GET @Path("Room")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromRoom() {
		Event e1 = new Event(new Creneau());
		Event e2 = new Event(new Creneau());
		
		List<Event> listEvt = new ArrayList<Event>();
		listEvt.add(e1);
		listEvt.add(e2);
		return listEvt;
	}
}