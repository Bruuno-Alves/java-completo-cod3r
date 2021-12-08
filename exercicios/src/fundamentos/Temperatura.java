package fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //instancia um objeto Scanner
		
		System.out.print("Informe uma temperatura em fahrenheit: "); //pede para o usuário entrar com um valor
		
		double fah = scan.nextDouble(); //lê o valor informado pelo usuário
		final double AJUSTE = 32; //constante subtraída da temperatura
		final double FATOR = 5.0 / 9.0; //multiplicador
		double celsius = (fah - AJUSTE) * FATOR; //fórmula de conversão
		
		System.out.println("A temperatura em graus celsius é " + celsius + "ºC."); //imprime o resultado
		
		System.out.print("Informe uma nova temperatura em fahrenheit: "); //solicita um novo valor ao usuario
		fah = scan.nextDouble(); //usuario informa um novo valor
		celsius = (fah - AJUSTE) * FATOR; //a variavel celsius é calculada novamente
		
		System.out.println("A nova temperatura em graus celsius é " + celsius + "ºC."); //imprime o novo resultado
		
	}

}
