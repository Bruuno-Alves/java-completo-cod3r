package oo.heranca;

public class Monstro extends Jogador {
	
	// Esse construtor chama o construtor da própria classe
	public Monstro() {
		this(0, 0);
	}
	
	// Esse construtor chama o construtor da classe mãe
	public Monstro(int posX, int posY) {
		super(posX, posY);
	}

}
