package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {

		//Strings s�o objetos, portanto possui m�todos
		String s = "Texto";
		System.out.println(s.toUpperCase());
		
		//objetos n�o possuem m�todos
		int a = 123;
		//System.out.println(a.toString());
		
		//Wrappers podem ser usados para atribuir m�todos a tipos primitivos
		Integer b = 123;
		System.out.println(b.toString());
		
		
		

	}

}
