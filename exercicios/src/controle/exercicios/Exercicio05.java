package controle.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		int num = scan.nextInt();
		
		int primo = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				primo++;
			}
		}

		switch (primo) {
		case 2:
			System.out.println("O n�mero " + num + " � primo");
			break;
		default:
			System.out.println("O n�mero " + num + " n�o � primo");
				
		}
		
		scan.close();

	}

}
