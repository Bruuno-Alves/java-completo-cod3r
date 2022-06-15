package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Heroi heroi = new Heroi();
		heroi.posX = 10;
		heroi.posY = 10;
		
		Monstro monstro = new Monstro();
		monstro.posX = 10;
		monstro.posY = 11;
		
		System.out.printf("Vida do Heroi: %d\n", heroi.vida);
		System.out.printf("Vida do Monstro: %d\n", monstro.vida);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.printf("Vida do Heroi: %d\n", heroi.vida);
		System.out.printf("Vida do Monstro: %d\n", monstro.vida);
	}

}
