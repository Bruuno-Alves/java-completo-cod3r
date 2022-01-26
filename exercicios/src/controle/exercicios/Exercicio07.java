package controle.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int novoNumero = 0;
		int soma = 0;
		
		while(novoNumero >= 0) {
			System.out.print("Informe um número positivo: ");
			novoNumero = scan.nextInt();
			
			if(novoNumero >= 0) {
				soma += novoNumero;
				System.out.println("A soma atual dos números é: " + soma);
			}
			
		}

		scan.close();

	}

}
