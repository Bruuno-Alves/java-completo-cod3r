package controle.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		int valor = scan.nextInt();
	
		if((valor >= 0 && valor <= 10) && valor % 2 == 0) {
			System.out.println("O valor est� entre 0 e 10 e � par");
		} else if(valor >= 0 && valor <= 10) {
			System.out.println("O valor est� entre 0 e 10");
		} else if(valor %2 == 0) {
			System.out.println("O valor � par");
		} else {
			System.out.println("O valor n�o se encaixa nos requisitos");
		}

		scan.close();

	}

}
