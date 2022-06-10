package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		// Add e Push -> adicionam elementos � fila
		// A diferen�a � o comportamento quando a fila est� cheia		
		livros.add("O Pequeno Pr�ncipe"); // Quando cheia, retorna false
		livros.push("Don Quixote"); // Quando cheia, lan�a uma exce��o
		livros.push("O Hobbit");
		
		// Peek e element -> Obt�m o pr�ximo elemento da fila (sem remover)
		// A diferen�a � o comportamento quando a fila est� vazia		
		System.out.println("Peek -> " + livros.peek()); // Quando vazia, retorna null
		System.out.println("Element -> " + livros.element()); // Quando vazia, lan�a uma exce��o
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		// Poll e remove -> Obt�m o pr�ximo elemento da fila e remove
		// A diferen�a � o comportamento quando a fila est� vazia		
		System.out.println(livros.pop());
		System.out.println(livros.poll()); //Quando vazia. retorna null
		System.out.println(livros.remove());  //Quando vazia, lan�a uma exce��o
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		
	}

}
