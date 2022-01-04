package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		double valor = scan.nextDouble();
		
		System.out.println("O valor elevado ao quadrado é igual a: " + Math.pow(valor, 2));
		System.out.println("O valor elevado ao cubo é igual a: " + Math.pow(valor, 3));
		
		scan.close();

	}

}
