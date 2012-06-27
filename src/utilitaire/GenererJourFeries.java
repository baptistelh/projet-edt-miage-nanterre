package utilitaire;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.GregorianCalendar;
import java.util.List;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
 
public class GenererJourFeries {
   
    //Initialisation des constantes
    public static final String DATE_BEGIN = "20120101";
    public static final String DATE_END = "20131231";
    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    public static final String DTSTART = "DTSTART";
    public static final String GOOGLE_URL = "https://www.google.com/"
            + "calendar/ical/"
            + "fr.french%23holiday%40group.v.calendar.google.com"
            + "/public/basic.ics";
    public static final String SUMMARY = "SUMMARY";
    public static final String pattern = "yyyyMMdd";
    
    public GenererJourFeries() {
    	
    }
 
    public List<GregorianCalendar> genererJoursFeries() {
    	
    	List<GregorianCalendar> joursFeries = new ArrayList<GregorianCalendar>();
    	
        try {
            //Init
            final Date dateEnd = (new SimpleDateFormat(pattern)).parse(DATE_END);
            final Date dateBegin = (new SimpleDateFormat(pattern)).parse(DATE_BEGIN);
 
            //Mise en place du stream pour la récupération du fichier ICS
            final InputStream stream = new URL(GOOGLE_URL).openStream();
            CalendarBuilder builder = new CalendarBuilder();
            //Consommation du Stream et remplissage de l’objet calendar
            Calendar calendar = builder.build(stream);
            //Parcour du calendar pour récuperer les évenements
            for (Iterator it = calendar.getComponents().iterator(); it.hasNext();) {
                Component component = (Component) it.next();
                //Récupération de la date de l’evènement
                //à travers la propriété DTSTART
                final String dtStartValue = component.getProperty(DTSTART).getValue();
                //Récupération du déscriptif de l’evènement
                //à travers la propriété SUMMARY
//                final String summaryValue = component.getProperty(SUMMARY).getValue();
                Date dateEvent = (new SimpleDateFormat(pattern)).parse(dtStartValue);
                //Test si la date est bien dans notre interval
                if (dateEvent.after(dateEnd) || dateEvent.before(dateBegin)) {
                    continue;
                }
                //Converstion de la date dans un format plus convivial
                String dateStartValue = (new SimpleDateFormat(DD_MM_YYYY)).format(dateEvent);
                //Affichage de notre message
                
                int d = Integer.parseInt(dateStartValue.split("/")[0]);
                int m = Integer.parseInt(dateStartValue.split("/")[1])-1;
                int y = Integer.parseInt(dateStartValue.split("/")[2]);
                
                joursFeries.add(new GregorianCalendar(y,m,d));
            }
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		return joursFeries;
    }
}
