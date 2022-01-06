package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o nome do dia da semana: ");
		String dia = scan.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Dia 1");
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println("Dia 2");
		} else if(dia.equalsIgnoreCase("ter�a") || dia.equalsIgnoreCase("terca")) {
			System.out.println("Dia 3");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("Dia 4");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("Dia 5");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("Dia 6");
		} else if(dia.equalsIgnoreCase("s�bado") || dia.equalsIgnoreCase("sabado")) {
			System.out.println("Dia 7");
		} else {
			System.out.println("Dia inv�lido!");
		}
		
		scan.close();

	}

}
