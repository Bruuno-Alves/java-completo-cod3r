package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //instanciando a partir da classe Integer, a variável recebe os métodos da classe
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); //tipos primitivos podem utilizar os métidos ao serem chamados pela classe
		
		System.out.println(("" + num1).length()); //a concatenar uma string à um tipo numético, o tipo é convertido para string
		System.out.println(("" + num2).length());

	}

}
