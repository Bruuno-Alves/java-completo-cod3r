package oo.heranca;

public class Monstro extends Jogador {
	
	// Esse construtor chama o construtor da pr�pria classe
	public Monstro() {
		this(0, 0);
	}
	
	// Esse construtor chama o construtor da classe m�e
	public Monstro(int posX, int posY) {
		super(posX, posY);
	}

}
