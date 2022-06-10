package array;

public class ExercicioForEach {

	public static void main(String[] args) {
		
		double[] notas = new double[4];
		notas[0] = 8.6;
		notas[1] = 6.8;
		notas[2] = 9.8;
		notas[3] = 8.6;
		
		for(double nota : notas) {
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		double totalNotas = 0;
		for(double nota : notas) {
			totalNotas += nota;
		}
		
		System.out.println("Média: " + totalNotas / notas.length);

	}

}
