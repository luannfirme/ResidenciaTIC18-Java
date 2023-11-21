package calculadora;

import java.util.Scanner;

public class Calculadora {
	private int numero1, numero2;

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public void adicao() {
		int resultado = this.numero1 + this.numero2;
		System.out.println("Resultado da operação (adição): " + resultado);
	}

	public void subtracao() {
		int resultado = this.numero1 - this.numero2;
		System.out.println("Resultado da operação (subtração): " + resultado);
	}

	public void multiplicacao() {
		int resultado = this.numero1 * this.numero2;
		System.out.println("Resultado da operação (multiplicação): " + resultado);
	}

	public void divisao() {
		int resultado = this.numero1 / this.numero2;
		System.out.println("Resultado da operação (divisão): " + resultado);
	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int selecao;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um número: ");
		calc.setNumero1(sc.nextInt());

		System.out.println("Insira outro número: ");
		calc.setNumero2(sc.nextInt());

		System.out.println("Que operação deseja realizar?");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("0. Sair");
		selecao = sc.nextInt();

		switch (selecao) {
		case 1: {
			calc.adicao();
			break;
		}
		case 2: {
			calc.subtracao();
			break;
		}
		case 3: {
			calc.multiplicacao();
			break;
		}
		case 4: {
			calc.divisao();
			break;
		}
		case 0: {
			System.out.println("Aplicação finalizada.");
			break;
		}
		default: {
			System.out.println("Escolha inválida. Por favor, execute o programa novamente.");
			break;
		}
		}
	}
}
