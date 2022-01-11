package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String valor = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			valor = scan.nextLine();
			
		} while(!valor.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado");
		
		scan.close();

	}

}
