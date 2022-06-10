package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		// Add e Push -> adicionam elementos à fila
		// A diferença é o comportamento quando a fila está cheia		
		livros.add("O Pequeno Príncipe"); // Quando cheia, retorna false
		livros.push("Don Quixote"); // Quando cheia, lança uma exceção
		livros.push("O Hobbit");
		
		// Peek e element -> Obtém o próximo elemento da fila (sem remover)
		// A diferença é o comportamento quando a fila está vazia		
		System.out.println("Peek -> " + livros.peek()); // Quando vazia, retorna null
		System.out.println("Element -> " + livros.element()); // Quando vazia, lança uma exceção
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		// Poll e remove -> Obtém o próximo elemento da fila e remove
		// A diferença é o comportamento quando a fila está vazia		
		System.out.println(livros.pop());
		System.out.println(livros.poll()); //Quando vazia. retorna null
		System.out.println(livros.remove());  //Quando vazia, lança uma exceção
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		
	}

}
