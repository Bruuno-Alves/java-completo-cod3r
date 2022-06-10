package array;

public class ForEach {

	public static void main(String[] args) {

		double[] notas = { 8.3, 9.2, 5.6, 7.2};
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double nota : notas) {
			System.out.print(nota + " ");
		}
		
	}

}
