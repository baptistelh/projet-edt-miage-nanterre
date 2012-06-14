package webservice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Event {
	private int year;
	private int mounth;
	private int date;
	private int hour;
	private int minute;
	
	public Event(GregorianCalendar gc) {
		this.year = gc.get(Calendar.YEAR);
		this.mounth = gc.get(Calendar.MONTH)+1;
		this.date = gc.get(Calendar.DAY_OF_MONTH);
		this.hour = gc.get(Calendar.HOUR_OF_DAY);
		this.minute = gc.get(Calendar.MINUTE);
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMounth() {
		return mounth;
	}

	public void setMounth(int mounth) {
		this.mounth = mounth;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
}
