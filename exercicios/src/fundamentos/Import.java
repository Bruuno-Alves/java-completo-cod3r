package fundamentos;

import java.util.Date;

public class Import {

	public static void main(String[] args) {

		java.lang.String b = "Boa tarde";
		java.lang.System.out.println(b);//as classes e métodos do pacote lang não precisam ser importadas
		
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date(); //para instanciar um objeto da classe Date, o import da classe deve ser feito
		System.out.println(d);

	}

}
