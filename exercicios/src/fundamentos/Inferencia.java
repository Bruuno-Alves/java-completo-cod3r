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
		
		//c = 4.5; uma vez atribu�do o tipo primitivo, n�o pode ser alterado
		
		double d; //vari�vel declarada
		d = 123.65; //vari�vel incializada
		System.out.println(d); //vari�vel utilizada
		
		var e = 12; //inteiro
		// e = 12.05;
		System.out.println(e);

	}

}
