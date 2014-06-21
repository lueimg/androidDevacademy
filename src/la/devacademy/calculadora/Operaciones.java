package la.devacademy.calculadora;

public class Operaciones {

	public String Sumar(Double num1, Double num2) {

		String res = String.valueOf(num1 + num2);
		return res;
	}

	public String Restart(Double num1, Double num2) {

		String res = String.valueOf(num1 - num2);
		return res;
	}

	public String Multiplicar(Double num1, Double num2) {

		String res = String.valueOf(num1 * num2);
		return res;
	}

	public String Division(Double num1, Double num2) {

		String res = String.valueOf(num1 / num2);
		return res;
	}

}
