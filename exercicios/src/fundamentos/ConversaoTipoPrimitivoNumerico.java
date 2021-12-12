package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; //convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.234567899956; //convers�o expl�cita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; //convers�o expl�cita (CAST) - ao ultrapassar o limite de 127, o valor volta ao -128
		System.out.println(d);
		
		double e = 1.999999999;
		int f = (int) e; //convers�o expl�cita (CAST) - o valor ap�s a v�rgula � ignorado
		System.out.println(f);

	}

}
