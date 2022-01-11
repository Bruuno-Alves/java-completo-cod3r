package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String resposta = " ";
		
		while(!resposta.equalsIgnoreCase("sair")) {
			System.out.print("Digite um texto ou sair para parar: ");
			resposta = scan.nextLine();
			
			System.out.println("Você digitou: " + resposta);
		}
		
		System.out.println("Fim!");
		
		scan.close();

	}

}
