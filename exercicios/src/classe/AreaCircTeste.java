package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		
		//AreaCirc.PI = 3.1415;
		
		System.out.println(a.area());
		System.out.println(AreaCirc.area(100));
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI );
	}

}
