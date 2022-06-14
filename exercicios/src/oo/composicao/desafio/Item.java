package oo.composicao.desafio;

public class Item {
	
	Produto produto;
	int quantidade;
	
	Item(String nome, int quantidade, double preco) {
		this.produto = new Produto(nome, preco);
		this.quantidade = quantidade;
	}

}
