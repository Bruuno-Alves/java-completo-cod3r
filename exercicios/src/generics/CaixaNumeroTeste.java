package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {

		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.guardar(123);
		
		int coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.guardar(2.3);
		
		double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}

}
