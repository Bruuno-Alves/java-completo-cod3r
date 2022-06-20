package oo.heranca.desafio;

public class Carro {
	
	protected final int VELOCIDADE_MAXIMA;
	protected int velAtual;
	private int delta = 5;
	
	protected Carro(int velMaxima) {
		this.VELOCIDADE_MAXIMA =  velMaxima;
	}
	
	public void acelerar() {
		if(velAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velAtual = VELOCIDADE_MAXIMA;
		} else {
			velAtual += getDelta();
		}
	}
	
	public void frear() {
		if(velAtual >= 5) {
			velAtual -= 5;
		} else {
			velAtual = 0;
		}
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public String toString() {
		return "Velocidade atual do carro é " + this.velAtual + "Km/h";
	}

}
