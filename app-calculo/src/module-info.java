import br.com.bruno.app.Calculadora;
import br.com.bruno.app.calculo.CalculadoraImpl;

module app.calculo {
	
	requires transitive app.logging;
	exports br.com.bruno.app.calculo;
	
//	exports br.com.bruno.app.calculo.interno to app.financeiro;
	
	opens br.com.bruno.app.calculo to app.logging, app.financeiro;
	
	requires app.api;
	provides Calculadora with CalculadoraImpl;
}