package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = (float) 1.234567899956; //conversão explícita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; //conversão explícita (CAST) - ao ultrapassar o limite de 127, o valor volta ao -128
		System.out.println(d);
		
		double e = 1.999999999;
		int f = (int) e; //conversão explícita (CAST) - o valor após a vírgula é ignorado
		System.out.println(f);

	}

}
