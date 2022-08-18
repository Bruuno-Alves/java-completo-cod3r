module app.calculo {
	
	requires transitive app.logging;
	exports br.com.bruno.app.calculo;
	
	exports br.com.bruno.app.calculo.interno to app.financeiro;
	
	opens br.com.bruno.app.calculo to app.logging, app.financeiro;
}