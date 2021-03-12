package br.com.digitalinovationonedate;

import java.time.LocalTime;
import java.util.Date;

public class Exercicio9ClassLocalTime {

	public static void main(String[] args) {
		LocalTime agora = LocalTime.now();
		
		System.out.println(agora);
		
		LocalTime maisUmaHora = agora.plusHours(1);

		System.out.println(maisUmaHora);

	}

}
