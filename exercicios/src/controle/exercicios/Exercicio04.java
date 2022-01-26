package controle.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		
		int primo = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				primo++;
			}
		}

		if(primo <= 2) {
			System.out.println("O número " + num + " é primo.");
		} else {
			System.out.println("O número " + num + " não é primo.");
		}
		
		scan.close();

	}

}
