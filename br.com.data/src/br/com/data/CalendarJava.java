package br.com.data;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
		
//		c.add(Calendar.HOUR, 1); // Adicionar a hora utilizando Calendar, porem com add() ele altera o dia tambem 
//		System.out.println(c.getTime()); 
		
		c.roll(Calendar.HOUR, 1); // Adicionar a hora utilizando Calendar, neste caso altera somente o que pedir
		System.out.println(c.getTime()); 
		System.out.println();
		// Formatando as Datas
		
		Calendar c2 = Calendar.getInstance();
		DateFormat[] df = new DateFormat[6];
		
		df[0] = DateFormat.getInstance();
		df[1] = DateFormat.getDateInstance();
		df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		df[4] = DateFormat.getDateInstance(DateFormat.LONG);
		df[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat d : df){
			System.out.println(d.format(c2.getTime()));
		}
		System.out.println();
		// Utilizando Locale
		// ISO 639 pt - Portugues, BR - Brasil, es - Ingles, US - Estados Unidos
		
		Locale l = new Locale("it", "IT"); // No construtor tem 2 opções passa a Lingua, ou a Lingua e o Pais
		Calendar c3 = Calendar.getInstance();
		c3.set(2021, Calendar.DECEMBER, 07);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, l);
		System.out.println(df2.format(c3.getTime()));
 	}
}
