package br.com.digitalinovationonedate;

import java.util.Date;

public class Exemplo2Date {

public static void main(String[] args) {
	
		Long currentTimeMillis = System.currentTimeMillis();
	
		System.out.println(currentTimeMillis);
		
		Date d = new Date(currentTimeMillis);
		
		System.out.println(d);
	}
}
