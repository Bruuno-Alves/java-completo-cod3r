package array;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasDoAlunoA = new double[4];
		System.out.println(Arrays.toString(notasDoAlunoA));
		
		notasDoAlunoA[0] = 7.9;
		notasDoAlunoA[1] = 8;
		notasDoAlunoA[2] = 6.7;
		notasDoAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasDoAlunoA));
		System.out.println(notasDoAlunoA[0]);
		System.out.println(notasDoAlunoA[notasDoAlunoA.length - 1]);
		// System.out.println(notasDoAlunoA[4]); ERRO!
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasDoAlunoA.length; i++) {
			totalAlunoA += notasDoAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasDoAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}

}
