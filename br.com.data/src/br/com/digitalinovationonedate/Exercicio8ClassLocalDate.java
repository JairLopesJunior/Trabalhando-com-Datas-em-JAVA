package br.com.digitalinovationonedate;

import java.time.LocalDate;

public class Exercicio8ClassLocalDate {

	public static void main(String[] args) {
		// Introduzida no JAVA 8 - Trabalha exclusivamente com Datas
		LocalDate hoje  = LocalDate.now();
		
		System.out.println(hoje);

		LocalDate ontem = hoje.minusDays(1); // Retorna a data de ontem
		
		System.out.println(ontem);
	}

}
