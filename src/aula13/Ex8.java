package aula13;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		input.useLocale(Locale.ENGLISH);

		System.out.println("Quanto voc� ganha por hora?");
		
		double salarioPorHora = input.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou esse m�s?");
		
		double horasTrabalhadas = input.nextDouble();
		
		double salarioDoMes = salarioPorHora * horasTrabalhadas;
				
		System.out.println("Voc� receber�: " + salarioDoMes);
		
	}

}
