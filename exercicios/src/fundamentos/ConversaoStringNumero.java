package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor:");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		System.out.println("A soma dos valores é: " + (numero1 + numero2));
		System.out.println("A média dos valores é: " + (numero1 + numero2) / 2);
	}

}
