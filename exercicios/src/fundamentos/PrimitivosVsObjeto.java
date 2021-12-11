package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {

		//Strings são objetos, portanto possui métodos
		String s = "Texto";
		System.out.println(s.toUpperCase());
		
		//objetos não possuem métodos
		int a = 123;
		//System.out.println(a.toString());
		
		//Wrappers podem ser usados para atribuir métodos a tipos primitivos
		Integer b = 123;
		System.out.println(b.toString());
		
		
		

	}

}
