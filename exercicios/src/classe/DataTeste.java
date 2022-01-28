package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data nascimento = new Data(18, 06, 1990);
		
		Data dataPadrao = new Data();
		dataPadrao.ano = 2021;
				
		System.out.println("Eu nasci no dia " + nascimento.obterData());
		System.out.println("A data padrão é " + dataPadrao.obterData());
		
		nascimento.imprimirDataFormatada();
		
	}

}
