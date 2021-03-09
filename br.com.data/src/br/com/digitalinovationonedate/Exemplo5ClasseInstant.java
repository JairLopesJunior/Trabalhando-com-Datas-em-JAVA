package br.com.digitalinovationonedate;

import java.time.Instant;
import java.util.Date;

public class Exemplo5ClasseInstant {

	public static void main(String[] args) {
		
		Date dataInicio = new Date(1513124807691L);
		
		System.out.println(dataInicio);
		
		Instant instant = dataInicio.toInstant();
		
		System.out.println(instant);
	}
}
