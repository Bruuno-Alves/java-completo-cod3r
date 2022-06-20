package oo.heranca;

public class Jogador {
	
	public int vida = 100;
	public int posX;
	public int posY;
	
	// Esse construtor chama o construtor da própria classe
	protected Jogador() {
		this(0, 0);
	}
	
	protected Jogador(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(this.posX - oponente.posX);
		int deltaY = Math.abs(this.posY - oponente.posY);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			posY++;
			break;
		case SUL: 
			posY--;
			break;
		case LESTE:
			posX++;
			break;
		case OESTE:
			posX--;
			break;
		}
		return true;
	}

}
