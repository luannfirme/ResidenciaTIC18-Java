package calculadora;

class DivisionByZeroException extends Exception {
	public DivisionByZeroException(String message) {
		super(message);
	}
}

class Calculadora {
	public int adicionar(int a, int b) {
		return a + b;
	}

	public int subtrair(int a, int b) {
		return a - b;
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

	public int dividirInteiros(int a, int b) throws DivisionByZeroException {
		if (b == 0) {
			throw new DivisionByZeroException("Divisão por zero não permitida.");
		}
		return a / b;
	}

	public float dividirFloat(float a, float b) throws DivisionByZeroException {
		if (b == 0) {
			throw new DivisionByZeroException("Divisão por zero não permitida.");
		}
		return a / b;
	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		try {
			int resultadoInteiro = calc.dividirInteiros(10, 2);
			System.out.println("Divisão de inteiros: " + resultadoInteiro);

			float resultadoFloat = calc.dividirFloat(10.5f, 0);
			System.out.println("Divisão de floats: " + resultadoFloat);
		} catch (DivisionByZeroException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}