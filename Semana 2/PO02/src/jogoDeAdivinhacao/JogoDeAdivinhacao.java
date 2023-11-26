package jogoDeAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

	public static void main(String[] args) {
		int resposta;
		int max = 100;
		int min = 1;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numeroGerado = rand.nextInt((max - min) + 1) + min;

		do {
			System.out.println("De 0 a 100 qual número foi gerado?");
			System.out.print("R: ");
			resposta = sc.nextInt();

			if (numeroGerado < resposta)
				System.out.println("Muito alto, o número gerado é menor.");

			if (numeroGerado > resposta)
				System.out.println("Muito baixo, o número gerado é maior.");

		} while (numeroGerado != resposta);

		System.out.println("Parabéns!!");
		System.out.println("Você acertou, o valor gerado foi: " + numeroGerado);
	}
}
