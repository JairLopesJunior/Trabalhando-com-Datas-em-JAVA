package br.com.digitalinovationonedate;

import java.util.Calendar;

public class Exemplo6ClassCalendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("A data corrente é:" + c.getTime());
		
		c.add(Calendar.DATE, -15);
		System.out.println("15 dias atrás: " + c.getTime());
		
		c.add(Calendar.MONTH, 4);
		System.out.println("4 meses atrás: " + c.getTime());
		
		c.add(Calendar.YEAR, 2);
		System.out.println("2 anos depois: " + c.getTime());
		
		// Imprimindo Data e Horas
		
		Calendar c2 = Calendar.getInstance();
		
		System.out.printf("%tc\n", c2); // Pega data e hora não formatado Ter mar 09 17:36:18 BRT 2021
		
		System.out.printf("%tF\n", c2); // Pega somente a data 2021-03-09
		
		System.out.printf("%tD\n", c2); // Pega somente a data 03/09/21
		
		System.out.printf("%tr\n", c2); // Pega somente a hora 05:36:18 PM
		
		System.out.printf("%tT\n", c2); // Pega somente a hora 17:36:18
	}
}
