package aula13;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double farenheit;
		double celsius;
		
		System.out.println("Digite a temperatura em Farenheit que gostaria de converter para Celsius:");
		
		farenheit = input.nextDouble();
		
		celsius = 5*((farenheit-32)/9);
		
		System.out.println("A temperatura em Celsius é: "+ celsius + "°C");
		

	}

}
