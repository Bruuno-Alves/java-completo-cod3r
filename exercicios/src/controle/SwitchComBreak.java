package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a nota: ");
		int nota = scan.nextInt();
		
		String conceito = "";
		
		switch(nota) {
		case 10, 9:
			conceito = "A";
			break;
		case 8, 7:
			conceito = "B";
			break;
		case 6, 5:
			conceito = "C";
			break;
		case 4, 3:
			conceito = "D";
			break;
		case 2, 1, 0:
			conceito = "E";
			break;
		default:
			conceito = "não encontrado";
		}
		
		System.out.println("Conceito " + conceito);

		scan.close();

	}

}
