package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.5;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		
		System.out.printf("O valor do %s � de R$ %.2f\n", p1.nome, precoFinal1);
		System.out.printf("O valor da %s � de R$ %.2f\n", p2.nome, precoFinal2);
		System.out.printf("A m�dia do carrinho � de R$ %.2f", mediaCarrinho);

	}

}
