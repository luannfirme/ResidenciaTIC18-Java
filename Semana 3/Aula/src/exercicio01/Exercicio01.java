package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	private int num1, num2;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void calcular() {
		int resultado;
		resultado = this.num1 + this.num2;
		System.out.println("Resultado da soma: " + resultado);
	}

	public static void main(String[] args) {
		Exercicio01 exercicio = new Exercicio01();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		exercicio.setNum1(sc.nextInt());
		System.out.println("Insira o segundo valor: ");
		exercicio.setNum2(sc.nextInt());
		
		exercicio.calcular();

	}
}
