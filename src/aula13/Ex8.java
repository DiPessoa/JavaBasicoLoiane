package aula13;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		input.useLocale(Locale.ENGLISH);

		System.out.println("Quanto você ganha por hora?");
		
		double salarioPorHora = input.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		
		double horasTrabalhadas = input.nextDouble();
		
		double salarioDoMes = salarioPorHora * horasTrabalhadas;
				
		System.out.println("Você receberá: " + salarioDoMes);
		
	}

}
