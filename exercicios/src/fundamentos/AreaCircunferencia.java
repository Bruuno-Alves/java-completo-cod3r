package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4;
		final double PI = 3.14159; //final não permite que o valor da variável seja alterado durante a execução do program
		
		double area = PI * raio * raio;
		
		System.out.println("Área = " + area + "m²");
		
		raio = 10; //novo valor atribuído à variável
		area = PI * raio * raio; //área calculada com base no novo raio
		
		System.out.println("Área = " + area +"m²"); //imprime a nova area
		
	}

}
