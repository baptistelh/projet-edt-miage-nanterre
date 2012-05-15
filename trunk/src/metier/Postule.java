package metier;

import java.util.GregorianCalendar;


public class Postule {
    private GregorianCalendar Date;
    private String Commentaire;
    private GregorianCalendar DateAudition;
	
    public Postule() {
	}

	public Postule(GregorianCalendar date, String commentaire,
			GregorianCalendar dateAudition) {
		Date = date;
		Commentaire = commentaire;
		DateAudition = dateAudition;
	}

	public GregorianCalendar getDate() {
		return Date;
	}

	public void setDate(GregorianCalendar date) {
		Date = date;
	}

	public String getCommentaire() {
		return Commentaire;
	}

	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}

	public GregorianCalendar getDateAudition() {
		return DateAudition;
	}

	public void setDateAudition(GregorianCalendar dateAudition) {
		DateAudition = dateAudition;
	}
}
