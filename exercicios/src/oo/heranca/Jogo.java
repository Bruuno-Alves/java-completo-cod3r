package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Jogador j1 = new Jogador();
		j1.posX = 10;
		j1.posY = 10;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		
		System.out.printf("Posição atual: X%d - Y%d", j1.posX, j1.posY);
		
	}

}
