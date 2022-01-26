package controle.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = 0;
		int maiorNumero = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe um número: ");
			numero = scan.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		
		System.out.print("O maior número digitado foi: " + maiorNumero);

		scan.close();

	}

}
