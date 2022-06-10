package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de alunos: ");
		int qtAlunos = scan.nextInt();
		
		System.out.print("Qual a quantidade de notas: ");
		int qtNotas = scan.nextInt();
		
		double[] [] notasDaClasse = new double[qtAlunos] [qtNotas];
		
		double totalNotas = 0;
		
		for(int i = 0; i < qtAlunos; i++) {
			for(int j = 0; j < qtNotas; j++) {
				System.out.print("Informe a " + (j + 1) + "ª nota do " + (i + 1) + "º aluno: ");
				notasDaClasse[i] [j] = scan.nextDouble();
				totalNotas += notasDaClasse[i] [j];
			}
		}

		double media = totalNotas / (qtAlunos * qtNotas);
		
		System.out.println("A média da turma é: " + media);
		
		for(double[] nota : notasDaClasse) {
			System.out.println(Arrays.toString(nota));
		}
		
		scan.close();

	}

}
