module app.financeiro {
	
	requires java.base; // Implicitamente já importado
//	requires app.calculo;
	
	requires app.api;
	uses br.com.bruno.app.Calculadora;
}