package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		// Add e Offer -> adicionam elementos � fila
		// A diferen�a � o comportamento quando a fila est� cheia
		fila.add("Ana"); // Quando cheia, retorna false
		fila.offer("Bia"); // Quando cheia, lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e element -> Obt�m o pr�ximo elemento da fila (sem remover)
		// A diferen�a � o comportamento quando a fila est� vazia
		System.out.println(fila.peek()); // Quando vazia, retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Quando vazia, lan�a uma exce��o
		System.out.println(fila.element());
		
		// Poll e remove -> Obt�m o pr�ximo elemento da fila e remove
		// A diferen�a � o comportamento quando a fila est� vazia
		System.out.println(fila.poll()); //Quando vazia. retorna null
		System.out.println(fila.remove()); //Quando vazia, lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// fila.size(); retorna o tamanho da fila
		// fila.clear(); limpa toda a fila
		// fila.isEmpty(); verifica se a fila est� vazia
		// fila.contains(); verifica se a fila cont�m determinado elemento
		
	}

}
