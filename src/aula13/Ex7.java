package aula13;

import java.util.Scanner;

public class Ex7 {
	

	public static void main(String[] args) {
		
			
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Digite a medida do lado do quadrado:");
		
		double lado = input.nextDouble();
		
		double area;
		
		area = lado * lado;
		
		System.out.println("A área do quadrado de lado " + lado + " é " + area);
		
		

	}

}
