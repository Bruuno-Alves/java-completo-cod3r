package oo.composicao.desafio;

import java.util.LinkedList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new LinkedList<>();
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.produto.preco * item.quantidade;
		}
		return total;
	}

}
