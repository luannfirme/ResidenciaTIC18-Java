package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
	private int numero;

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void ImparPar() {
		String retorno = "impar";

		if (this.numero % 2 == 0)
			retorno = "par";

		System.out.println("o número digita é " + retorno);
	}

	public static void main(String[] args) {
		Exercicio04 exec = new Exercicio04();

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um número: ");
		exec.setNumero(sc.nextInt());
		
		exec.ImparPar();
	}
}
