package br.com.digitalinovationonedate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo7ClassSimpleDateFormat {

	public static void main(String[] args) {
		Date agora = new Date();
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataFormatada = formater.format(agora);
		
		System.out.println(dataFormatada);
	}
}
