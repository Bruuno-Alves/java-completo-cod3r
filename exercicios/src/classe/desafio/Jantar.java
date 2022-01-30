package classe.desafio;

public class Jantar {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Bruno", 83.4);
		Comida brocolis = new Comida("Brócolis", 0.25);
		Comida frango = new Comida("Frango", 0.15);
		
		System.out.println(pessoa.apresentar());;
		
		pessoa.comer(brocolis);
		pessoa.comer(frango);
		
		System.out.printf(pessoa.apresentar());

	}

}
