package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari() {
		this(400);
	}
	
	public Ferrari(int velMaxima) {
		super(velMaxima);
		setDelta(15);;
	}
	
//	@Override
//	void acelerar() {
//		velAtual += 15;
//	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
	@Override
	public String toString() {
		return "A velocidade atual da Ferrari é: " + this.velAtual + "Km/h";
	}
}
