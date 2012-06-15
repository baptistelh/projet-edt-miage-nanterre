package beans;
import java.io.Serializable;
import java.util.GregorianCalendar;


public class Promotion_Historisee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 356428199894988051L;
	private Promotion maPromotion;
	private GregorianCalendar dateHistorique;
	
	/**
	 * 
	 */
	public Promotion_Historisee() {
		super();
	}

	/**
	 * @param numeroPromotion
	 * @param dateHistorique
	 */
	public Promotion_Historisee(Promotion maPromotion,GregorianCalendar dateHistorique) {
		this();
		this.maPromotion = maPromotion;
		this.dateHistorique = dateHistorique;
	}

	/**
	 * @return the dateHistorique
	 */
	public GregorianCalendar getDateHistorique() {
		return dateHistorique;
	}

	/**
	 * @param dateHistorique the dateHistorique to set
	 */
	public void setDateHistorique(GregorianCalendar dateHistorique) {
		this.dateHistorique = dateHistorique;
	}

	public Promotion getMaPromotion() {
		return maPromotion;
	}

	public void setMaPromotion(Promotion maPromotion) {
		this.maPromotion = maPromotion;
	}
	
}
