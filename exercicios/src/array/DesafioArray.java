package array;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas notas deseja informar: ");
		int qtNotas = scan.nextInt();
		
		double[] notasDoAluno = new double[qtNotas];
		
		for(int i = 0; i < qtNotas; i++) {
			System.out.print("Informe a " + (i + 1) + "ª nota: ");
			notasDoAluno[i] = scan.nextDouble();
		}
		
		double totalNotas = 0;
		
		for(double nota : notasDoAluno) {
			totalNotas += nota;
		}
		
		double media = totalNotas / qtNotas;
		
		System.out.printf("A média do aluno foi: %.1f", media);
		
		scan.close();

	}

}
