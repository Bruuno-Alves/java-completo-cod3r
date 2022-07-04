package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			geraErro1();
		} catch(RuntimeException exception) {
			System.out.println(exception.getMessage());
		}
		
		try {
			geraErro2();
		} catch(Throwable exception) {
			System.out.println(exception.getMessage());
		}
		
		System.out.println("Fim!");
		
	}
	
	//Lan�a uma exce��o N�O checada ou N�O verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}
	
	//Lan�a uma exce��o checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02");
	}
}
