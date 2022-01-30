package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		// this.dia = 1;
		// this.mes = 1;
		// this.ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterData() {
		final String formato = "%02d/%02d/%04d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}

	//é possível utilizar um método dentro de outro
	//evitar utilizar println dentro de métodos
	void imprimirDataFormatada() {
		System.out.println(this.obterData());;
	}
	
}
