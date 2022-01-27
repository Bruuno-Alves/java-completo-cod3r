package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data nascimento = new Data();
		nascimento.dia = 18;
		nascimento.mes = 06;
		nascimento.ano = 1990;
		
		Data natal = new Data();
		natal.dia = 25;
		natal.mes = 12;
		natal.ano = 2022;
				
		System.out.printf("Eu nasci no dia %02d/%02d/%04d\n", nascimento.dia, nascimento.mes, nascimento.ano);
		System.out.printf("O natal é dia %02d/%02d/%04d", natal.dia, natal.mes, natal.ano);

	}

}
