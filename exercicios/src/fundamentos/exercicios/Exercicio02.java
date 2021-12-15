package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe uma temperatura em celsius: ");
		double celsius = scan.nextDouble();
		
		double fahrenheit = celsius * 1.8 + 32;
		
		System.out.printf("A temperatura convertida para fahrenheit é: %.2f", fahrenheit);
		
		scan.close();
		
	}

}
