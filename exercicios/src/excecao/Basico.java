package excecao;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception execao) {
			System.out.println("Erro ao imprimir o nome do aluno");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir por zero");
		}
		
		System.out.println("Fim!");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
