package controle.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um ano: ");
		int ano = scan.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println("O ano � bissexto");
		} else if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("Ano � bissexto");
		} else {
			System.out.println("Ano n�o � bissexto");
		}

		scan.close();

	}

}
