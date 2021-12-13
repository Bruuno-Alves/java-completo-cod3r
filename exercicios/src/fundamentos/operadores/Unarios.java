package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
//		primeiro usa a vari�vel, depois incrementa / decrementa
		a++; // a = a + 1;
		a--; // a = a - 1;
		
//		primeiro incrementa / decrementa, depois usa a vari�vel
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}

}
