package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		// Add e Offer -> adicionam elementos à fila
		// A diferença é o comportamento quando a fila está cheia
		fila.add("Ana"); // Quando cheia, retorna false
		fila.offer("Bia"); // Quando cheia, lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e element -> Obtém o próximo elemento da fila (sem remover)
		// A diferença é o comportamento quando a fila está vazia
		System.out.println(fila.peek()); // Quando vazia, retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Quando vazia, lança uma exceção
		System.out.println(fila.element());
		
		// Poll e remove -> Obtém o próximo elemento da fila e remove
		// A diferença é o comportamento quando a fila está vazia
		System.out.println(fila.poll()); //Quando vazia. retorna null
		System.out.println(fila.remove()); //Quando vazia, lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// fila.size(); retorna o tamanho da fila
		// fila.clear(); limpa toda a fila
		// fila.isEmpty(); verifica se a fila está vazia
		// fila.contains(); verifica se a fila contém determinado elemento
		
	}

}
