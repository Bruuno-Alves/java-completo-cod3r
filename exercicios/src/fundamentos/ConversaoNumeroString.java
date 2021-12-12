package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //instanciando a partir da classe Integer, a vari�vel recebe os m�todos da classe
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); //tipos primitivos podem utilizar os m�tidos ao serem chamados pela classe
		
		System.out.println(("" + num1).length()); //a concatenar uma string � um tipo num�tico, o tipo � convertido para string
		System.out.println(("" + num2).length());

	}

}
