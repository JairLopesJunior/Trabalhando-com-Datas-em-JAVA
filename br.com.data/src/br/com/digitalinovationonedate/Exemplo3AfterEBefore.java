package br.com.digitalinovationonedate;

import java.util.Date;

public class Exemplo3AfterEBefore {

	public static void main(String[] args) {
		
		Date dataNoPassado = new Date(1513124807691L);
		
		Date dataNoFuturo = new Date(1613124807691L);
		
		boolean isAfter = dataNoPassado.after(dataNoFuturo);
		
		System.out.println(isAfter); // False
		
		boolean isBefore = dataNoPassado.before(dataNoFuturo);
		
		System.out.println(isBefore); // True
		
		boolean isEquals = dataNoPassado.equals(dataNoFuturo);
		
		System.out.println(isEquals);  // False
		
		
	}
}
