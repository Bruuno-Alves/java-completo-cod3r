package controle.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = scan.next();
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}

		scan.close();

	}

}
