package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		System.out.println(civic);
		System.out.println(ferrari);
		
		ferrari.ligarTurbo();
		
		civic.acelerar();
		ferrari.acelerar();
		
		civic.acelerar();
		ferrari.acelerar();
		
		civic.acelerar();
		ferrari.acelerar();
		
		civic.acelerar();
		ferrari.acelerar();
		
		System.out.println(civic);
		System.out.println(ferrari);
		
		civic.frear();
		ferrari.frear();
		
		civic.frear();
		ferrari.frear();
		
		civic.frear();
		ferrari.frear();
		
		civic.frear();
		ferrari.frear();
		
		civic.frear();
		ferrari.frear();
		
		System.out.println(ferrari.velocidadeAr());
		
		System.out.println(civic);
		System.out.println(ferrari);
	}

}
