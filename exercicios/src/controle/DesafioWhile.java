package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe as notas dos alunos. Para sair digite -1");
		
		double nota = 0;
		double totalNota = 0;
		int alunos = 0;
		
		do {
			System.out.print("Informe a nota do aluno: ");
			nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				totalNota += nota;
				alunos++;
			} else if (nota != -1) {
				System.out.println("Informe uma nota válida");
			}
			
		} while (nota != -1);

		double media = totalNota / alunos;
		
		System.out.println("A média da nota dos " + alunos + " alunos foi: " + media);
		
		scan.close();

	}

}
