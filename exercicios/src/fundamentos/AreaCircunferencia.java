package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4;
		final double PI = 3.14159; //final n�o permite que o valor da vari�vel seja alterado durante a execu��o do program
		
		double area = PI * raio * raio;
		
		System.out.println("�rea = " + area + "m�");
		
		raio = 10; //novo valor atribu�do � vari�vel
		area = PI * raio * raio; //�rea calculada com base no novo raio
		
		System.out.println("�rea = " + area +"m�"); //imprime a nova area
		
	}

}
