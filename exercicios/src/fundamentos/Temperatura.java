package fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //instancia um objeto Scanner
		
		System.out.print("Informe uma temperatura em fahrenheit: "); //pede para o usu�rio entrar com um valor
		
		double fah = scan.nextDouble(); //l� o valor informado pelo usu�rio
		final double AJUSTE = 32; //constante subtra�da da temperatura
		final double FATOR = 5.0 / 9.0; //multiplicador
		double celsius = (fah - AJUSTE) * FATOR; //f�rmula de convers�o
		
		System.out.println("A temperatura em graus celsius � " + celsius + "�C."); //imprime o resultado
		
	}

}
