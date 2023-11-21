package conversorDeTemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {
	private double temperatura;

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public void conversorFahrenheit() {
		double resultado = (this.temperatura * 9 / 5) + 32;
		System.out.println("A temperatura convertida de Celsius para Fahrenheit é: " + resultado + " ºF");
	}

	public void conversorCelsius() {
		double resultado = (this.temperatura - 32) * 5 / 9;
		System.out.println("A temperatura convertida de Fahrenheit para Celsius é: " + resultado + " ºC");
	}

	public static void main(String[] args) {
		ConversorDeTemperatura conv = new ConversorDeTemperatura();
		int selecao;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a temperatura:");
		conv.setTemperatura(sc.nextDouble());

		System.out.println("Informe a unidade de origem:");
		System.out.println("1. Celsius");
		System.out.println("2. Fahrenheit");
		selecao = sc.nextInt();

		if (selecao == 1) {
			conv.conversorFahrenheit();
		} else if (selecao == 2) {
			conv.conversorCelsius();
		} else {
			System.out.println("Escolha inválida. Por favor, execute o programa novamente.");
		}
	}

}
