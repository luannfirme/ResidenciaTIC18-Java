package conversorDeMoeda;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Conversor de Moedas");
		System.out.print("Insira a taxa de câmbio: ");
		double taxaDeCambio = sc.nextDouble();

		System.out.print("Insira a quantia em dólares: ");
		double quantiaEmDolares = sc.nextDouble();

		double valorConvertido = converterMoeda(quantiaEmDolares, taxaDeCambio);
		System.out.println("Valor convertido: " + valorConvertido);
	}

	public static double converterMoeda(double quantidade, double taxa) {
		return quantidade * taxa;
	}
}
