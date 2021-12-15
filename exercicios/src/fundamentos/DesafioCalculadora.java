package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double num2 = scan.nextDouble();
		
		System.out.print("informe uma operação: [ + - * / % ] ");
		String operacao = scan.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		scan.close();

	}

}
