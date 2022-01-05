package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Equa��o: ax� + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = scan.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = scan.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = scan.nextInt();

		int delta = (b * b) - (4 * a * c);

		System.out.printf("\nSua equa��o �: %dx� + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta �: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equa��o �: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equa��o �: %.2f" ,x2);
		
		scan.close();

	}

}
