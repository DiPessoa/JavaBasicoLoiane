package aula13;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//aceitar a entrada de ponto como separador de decimal	
		scan.useLocale(Locale.ENGLISH);
		
		System.out.println("Digite a medida em metros para transformar em centímetros");
		
		double medida = scan.nextDouble();
		
		double medidaCm = medida * 100;
		
		System.out.println("A medida em centimetro é: " + medidaCm);
		

	}

}
