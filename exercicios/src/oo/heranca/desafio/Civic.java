package oo.heranca.desafio;

public class Civic extends Carro {
	
	Civic() {
		super(250);
	}
	
	@Override
	public String toString() {
		return "A velocidade atual do Civic � " + this.velAtual + "Km/h";
	}

}
