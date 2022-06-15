package oo.heranca.desafio;

public class Carro {
	
	int velAtual;
	
	void acelerar() {
		velAtual += 5;
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
