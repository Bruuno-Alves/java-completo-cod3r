package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a base do tri�ngulo: ");
		double base = scan.nextDouble();
		
		System.out.print("Informe a altura do tri�ngulo: ");
		double altura = scan.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A �rea do tri�ngulo �: " + area);
		
		scan.close();

	}

}
