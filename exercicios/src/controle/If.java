package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Informe a m�dia: ");
		double media = scan.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		
		boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;
		if(criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}
		
		scan.close();
		
	}

}
