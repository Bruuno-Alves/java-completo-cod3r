package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.2; //declarada e inicializada
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5; uma vez atribuído o tipo primitivo, não pode ser alterado
		
		double d; //variável declarada
		d = 123.65; //variável incializada
		System.out.println(d); //variável utilizada
		
		var e = 12; //inteiro
		// e = 12.05;
		System.out.println(e);

	}

}
