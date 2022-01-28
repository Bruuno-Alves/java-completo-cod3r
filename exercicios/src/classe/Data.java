package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;
	}
	
	String obterData() {
		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
	}

	//é possível utilizar um método dentro de outro
	//evitar utilizar println dentro de métodos
	void imprimirDataFormatada() {
		System.out.println(this.obterData());;
	}
	
}
