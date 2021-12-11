package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Bruno";
		var sobrenome = "Alves";
		var idade = 31;
		var salario = 12345.98;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		System.out.printf("Nome: %s %s\nIdade: %d anos\nSalário: R$ %.2f \n \n", nome, sobrenome, idade, salario);
		
		String frase = String.format("Nome: %s %s\nIdade: %d anos\nSalário: R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}

}
