module app.financeiro {
	
	requires java.base; // Implicitamente j� importado
//	requires app.calculo;
	
	requires app.api;
	uses br.com.bruno.app.Calculadora;
}