package br.com.data;

import java.util.Calendar;
import java.util.Date;

public class CalendarJava {
	
	static Calendar c = Calendar.getInstance();
	static Date data = new Date();

	public static  void main(String[]  args) {
		
		c.setTime(data);
		System.out.println(c);
		System.out.println(Calendar.TUESDAY);
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
	}
}
