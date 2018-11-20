package aula13;

import java.util.Scanner;

public class Ex4 {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Digite a nota do primeiro semestre:");
		
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota do segundo semestre:");
		
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a nota do terceiro semestre:");
		
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a nota do quarto semestre:");
		
		double nota4 = scan.nextDouble();
		
		System.out.println("A média final foi: " + (nota1 + nota2 + nota3 +
				nota4) / 4);

	}

}
