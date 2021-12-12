package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		
		boolean tv50 = trabalhoTerca && trabalhoQuinta;
		boolean tv32 = trabalhoTerca ^ trabalhoQuinta;
		
		boolean tomarSorvete = tv50 || tv32;
		
		boolean saudavel = !tomarSorvete;
		
		System.out.println("Comprou a TV de 50'?: " + tv50);
		System.out.println("Comprou a TV de 32'/: " + tv32);
		System.out.println("A família foi ao shopping tomar sorvete?: " + tomarSorvete);
		System.out.println("A família ficou mais saudável porque não tomou sorvete?: " + saudavel);
	}

}
