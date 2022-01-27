package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = (p1.preco * (1 - p1.desconto));
		double precoFinal2 = (p2.preco * (1 - p2.desconto));
		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		
		System.out.printf("O valor do %s é de R$ %.2f\n", p1.nome, precoFinal1);
		System.out.printf("O valor da %s é de R$ %.2f\n", p2.nome, precoFinal2);
		System.out.printf("A média do carrinho é de R$ %.2f", mediaCarrinho);

	}

}
