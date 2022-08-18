package br.com.bruno.app.calculo;

import br.com.bruno.app.Calculadora;
import br.com.bruno.app.calculo.interno.OperacoesAritimeticas;
import br.com.bruno.logging.Logger;

public class CalculadoraImpl implements Calculadora {

	private String id = "abc";

	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritimeticas.soma(nums);
	}

	public String getId() {
		return id;
	}

}
