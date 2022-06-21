package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Double> calc1 = (x, y) -> {
			return x + y;
		};
		System.out.println(calc1.apply(3.0, 5.0));
		
		
		BinaryOperator<Integer> calc2 = (x, y) -> {
			return x * y;
		};
		System.out.println(calc2.apply(4, 4));
		
		calc2 = (x, y) -> x + y;
		System.out.println(calc2.apply(2, 3));
	}

}
