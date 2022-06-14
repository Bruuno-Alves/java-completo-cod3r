package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Bruno");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		Item item1 = new Item("Caneta", 5, 2.5);
		Item item2 = new Item("Lapis", 5, 2.0);
		Item item3 = new Item("Caderno", 2, 15.3);
		Item item4 = new Item("Borracha", 3, 3.0);
		
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		compra1.itens.add(item1);
		compra1.itens.add(item2);
		compra2.itens.add(item3);
		compra2.itens.add(item4);
		
		System.out.println("O valor total da compra é: " + cliente1.obterTotalCompra());;
		
		
	}

}
