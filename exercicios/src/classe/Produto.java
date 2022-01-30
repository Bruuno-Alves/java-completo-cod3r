package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial) {
		this.nome = nomeInicial;
		this.preco = precoInicial;
	}
	
	double precoComDesconto() {
		double precoFinal = this.preco * (1 - desconto);
		return precoFinal;
	}

	double precoComDesconto(double descontoDoGerente) {
		double precoFinal = this.preco * (1 - (desconto + descontoDoGerente));
		return precoFinal;
	}
	
}
