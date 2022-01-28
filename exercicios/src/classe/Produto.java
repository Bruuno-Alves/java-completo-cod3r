package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		this.nome = nomeInicial;
		this.preco = precoInicial;
		this.desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		double precoFinal = this.preco * (1 - this.desconto);
		return precoFinal;
	}

	double precoComDesconto(double descontoDoGerente) {
		double precoFinal = this.preco * (1 - (this.desconto + descontoDoGerente));
		return precoFinal;
	}
	
}
