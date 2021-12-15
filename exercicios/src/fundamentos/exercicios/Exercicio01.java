package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe uma temperatura em fahrenheit: ");
		double fahreinheit = scan.nextDouble();
		
		double celsius = (fahreinheit - 32) / 1.8;
		
		System.out.printf("A temperatura convertida para celsius é: %.2fº", celsius);
		
		scan.close();
		
	}

}
