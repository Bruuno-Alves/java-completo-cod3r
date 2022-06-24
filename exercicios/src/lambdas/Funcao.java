package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		//Lambda para determinar se o valor é par ou impar
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		//Lambida para concatenar o texto inicial ao resultado
		Function<String, String> oResultadoE = valor -> "O resultado é " + valor;
		
		//Lambdas para concatenar !!! ou ???
		Function<String, String> empolgado = valor -> valor + "!!!";
		Function<String, String> duvida = valor -> valor + "???";
		
		System.out.println(parOuImpar.apply(32));

		//Composição de funções, colaborando para gerar um resutado mais complexo
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(33);
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);
		System.out.println(resultadoFinal2);
	}

}
