package aula13;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		double n3;
		double resultado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		
		n1 = input.nextInt();
				
		System.out.println("Digite outro n�mero inteiro:");
		
		n2 = input.nextInt();
		
		System.out.println("Digite um n�mero real:");
		
		n3 = input.nextDouble();
		
		resultado = (n1*2)/(n2/2);
		
		System.out.println("O produto do dobro do primeiro n�mero com a metade do segundo: " + resultado);
		
		resultado = (n1*3) + n3;
		
		System.out.println("A soma do triplo do primeiro com a o terceiro: " + resultado);
		
		resultado = n3*n3*n3;
		
		System.out.println("O cubo do terceiro n�mero: " + resultado);
		
		

	}

}
