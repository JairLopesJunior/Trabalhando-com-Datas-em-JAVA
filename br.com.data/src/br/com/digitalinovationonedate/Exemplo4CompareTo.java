package br.com.digitalinovationonedate;

import java.util.Date;

public class Exemplo4CompareTo {

	public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);
		
		Date dataNoFuturo = new Date(1613124807691L);
		
int compareTo = dataNoPassado.compareTo(dataNoFuturo);
		
		System.out.println(compareTo); // -1, Significa que a  data do Passado é diferente da do Futuro
		
		int compareTo2 = dataNoFuturo.compareTo(dataNoPassado);
		
		System.out.println(compareTo2); // 1, Significa que a  data do Futuro é diferente da do Passado
		
		int compareTo3 = dataNoFuturo.compareTo(dataNoFuturo);
		
		System.out.println(compareTo3); // 0, as datas são iguais
	}
}
