package oo.heranca;

public class Heroi extends Jogador {
	
	// Esse construtor chama o construtor da classe mãe
	Heroi(int posX, int posY) {
		super(posX, posY);
	}

	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
