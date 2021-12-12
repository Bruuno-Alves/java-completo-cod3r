package fundamentos.operadores;

public class Aritimeticos {

	public static void main(String[] args) {

		var x = 34.56;
		var y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double) b); //usando o cast é possivel obter um valor quebrado a partir de um int
		System.out.println(a / (float) b); //usando o cast é possivel obter um valor quebrado a partir de um int
		
		System.out.println(a % b); //retorna o resto da divisão
		
		System.out.println(x + y - a * b);

	}

}
