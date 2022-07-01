package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {

	public static void main(String[] args) {

		Consumer<String> println = System.out::println;
		
		Produto produto1 = new Produto("Notebook", 2347.58, 0.15, false);
		Produto produto2 = new Produto("Televisao", 1438.63, 0.3, true);
		Produto produto3 = new Produto("Patinete", 258.36, 0.05, false);
		Produto produto4 = new Produto("Patins", 149.9, 0.25, true);
		Produto produto5 = new Produto("Geladeira", 3485.70, 0.1, false);
		Produto produto6 = new Produto("Microondas", 1458.34, 0.35, true);
		Produto produto7 = new Produto("Fogao", 846.47, 0.31, true);
		Produto produto8 = new Produto("Secador de Cabelo", 258.67, 0.12, false);
		
		List<Produto> produtos =
				Arrays.asList(produto1, produto2, produto3, produto4, produto5, produto6, produto7, produto8);
		
		Predicate<Produto> desconto = produto -> produto.getDesconto() >= 0.3;
		Predicate<Produto> freteGratis = produto -> produto.isFreteGratis();
		Function<Produto, String> promocao = produto -> produto.getNome() + " está com uma super promoção!!";
		
		produtos.stream().filter(desconto).filter(freteGratis).map(promocao).forEach(println);
	}

}
