package br.com.bruno.app.financeiro;

import java.lang.reflect.Field;

import br.com.bruno.app.calculo.CalculadoraImpl;
import br.com.bruno.app.calculo.interno.OperacoesAritimeticas;

public class Teste {
	
	public static void main(String[] args) {
		
		CalculadoraImpl calc = new CalculadoraImpl();
		System.out.println(calc.soma(2, 3, 4));
		
		OperacoesAritimeticas op = new OperacoesAritimeticas();
		System.out.println(op.soma(4, 5, 6));
		
		try {
			Field fieldId = CalculadoraImpl.class.getDeclaredFields() [0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			fieldId.setAccessible(false);
			
			System.out.println(calc.getId());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
