package oo.heranca.desafio;

public class Civic extends Carro {
	
	public Civic() {
		super(250);
	}
	
	@Override
	public String toString() {
		return "A velocidade atual do Civic é " + this.velAtual + "Km/h";
	}

}
