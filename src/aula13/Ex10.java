package aula13;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double farenheit;
		double celsius;
		
		System.out.println("Digite a temperatura em Celsius que gostaria de converter para Farenheit:");
		
		celsius = input.nextDouble();
		
		farenheit = (celsius*9/5) + 32;
		
		System.out.println("A temperatura em Farenheit é: "+ farenheit + "°F");

	}
}

