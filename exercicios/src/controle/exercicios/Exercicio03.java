package controle.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("O aluno obteve a média " + media);
		
		if(media >= 7) {
			System.out.println("Aprovado");
		} else if(media < 7 && media >= 4) {
			System.out.println("Em recuperação");
		} else {
			System.out.println("Reprovado");
		}

		scan.close();
		
	}

}
