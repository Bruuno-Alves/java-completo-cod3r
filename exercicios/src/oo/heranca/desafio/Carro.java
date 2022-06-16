package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velAtual;
	int delta = 5;
	
	Carro(int velMaxima) {
		this.VELOCIDADE_MAXIMA =  velMaxima;
	}
	
	void acelerar() {
		if(velAtual + delta > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		} else {
			velAtual += delta;
		}
	}
	
	void frear() {
		if(velAtual >= 5) {
			velAtual -= 5;
		} else {
			velAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual do carro é " + this.velAtual + "Km/h";
	}

}
