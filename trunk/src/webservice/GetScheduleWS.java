package webservice;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.json.JSONConfiguration;

import dao.ECDAO;
import dao.EnseignantDAO;
import dao.SalleDAO;

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
		
		Enseignant e1=new Enseignant(1,"Almeida", "Marcos", "test addresse" , "0143855907",new GregorianCalendar(1960,10, 10), "logAragou", "pwdAragou");	
		Salle s1=new Salle("210A", 50, "enferNum1");
		Formation f1=new Formation();
		UE ue1=new UE(1,f1);
		EC ec1= new EC(1, ue1);
		ec1.setLibelle("Soutenance Projet 2");
		Type type1 = new Type(1, "TD");
		Jours j1=new Jours();
		j1.setDateDuJour(new GregorianCalendar(2012, 05, 28));
		Creneau cLundi = new Creneau(e1, s1, ec1, type1, j1, "10:45", 120);
		
		Event e = new Event(cLundi);
		c.addEvt(e);
		
		Enseignant e2=new Enseignant(1,"Legond-Aubry", "Fabrice", "test addresse" , "0143855908",new GregorianCalendar(1960,10, 10), "logGiroud", "pwdGiroud");	
		Salle s2=new Salle("210A", 50, "enferNum2");
		Formation f2=new Formation();
		UE ue2=new UE(1,f2);
		EC ec2= new EC(1, ue2);
		ec2.setLibelle("Partiel de RMI");
		Type type2 = new Type(1, "TD"); 
		Jours j2=new Jours();
		j2.setDateDuJour(new GregorianCalendar(2012, 05, 28));
		Creneau cMardi = new Creneau(e2, s2, ec2, type2, j2, "14:00", 180);
	
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
		
	
//	@GET @Path("urlavecparam/{paramtest}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public String getSchedule(@PathParam("paramtest") String str) {
//		return "le param est "+str;
//	}
	
	@GET @Path("/Ec")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromEc() {
		ECDAO ed = new ECDAO();
		
		List<EC> le =  ed.findAll();
		List<Event> listEvt = new ArrayList<Event>();
		
		for(EC e : le) {
			for(Creneau c : e.getMesCreneaux()) {
				listEvt.add(new Event(c));
			}
		}

		return listEvt;
	}
	
	@GET @Path("/Teacher")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromTeacher() {
		EnseignantDAO ed = new EnseignantDAO();
		
		List<Enseignant> le =  ed.findAll();
		List<Event> listEvt = new ArrayList<Event>();
		
		for(Enseignant e : le) {
			for(Creneau c : e.getMesCreneaux()) {
				listEvt.add(new Event(c));
			}
		}

		return listEvt;
	}
	
//	@GET @Path("/Promotion")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Event> getScheduleFromPromotion() {
//		PromotionDAO pd = new PromotionDAO();
//		
//		List<Promotion> lp =  pd.findAll();
//		List<Event> listEvt = new ArrayList<Event>();
//		
//		for(Promotion p : lp) {
//			for(Creneau c : p.getMesCreneaux())
//				listEvt.add(new Event(c));
//		}
//
//		return listEvt;
//	}
	
	@GET @Path("Room")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getScheduleFromRoom() {
		SalleDAO sd = new SalleDAO();
		
		List<Salle> ls =  sd.findAll();
		List<Event> listEvt = new ArrayList<Event>();
		
		for(Salle s : ls) {
			for(Creneau c : s.getMesCreneaux()) {
				listEvt.add(new Event(c));
			}
		}

		return listEvt;
	}
}