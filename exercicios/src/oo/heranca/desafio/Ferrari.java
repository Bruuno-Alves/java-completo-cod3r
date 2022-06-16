package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		this(400);
	}
	
	Ferrari(int velMaxima) {
		super(velMaxima);
		this.delta = 30;
	}
	
//	@Override
//	void acelerar() {
//		velAtual += 15;
//	}
	
	@Override
	void frear() {
		if(velAtual >= 15) {
			velAtual -= 15;
		} else {
			velAtual = 0;
		}
	}
	
	@Override
	public String toString() {
		return "A velocidade atual da Ferrari é: " + this.velAtual + "Km/h";
	}
}
