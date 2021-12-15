package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("informe o seu peso: ");
		double peso = scan.nextDouble();
		
		System.out.print("Informe a sua altura: ");
		double altura = scan.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("O seu IMC é: %.2f", imc);
		
		scan.close();

	}

}
