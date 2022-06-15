package oo.heranca;

public class Jogador {
	
	int posX;
	int posY;
	
	boolean andar(Direcao direcao) {
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
