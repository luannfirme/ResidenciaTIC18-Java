package manipulaArray;

import java.util.Scanner;

public class ManipulaArray {
	private int[] numeros;
	private int contador;

	public ManipulaArray() {
        this.numeros = new int[10];
        this.contador = 0;
    }

    public void setNumeros(int numero) {
        if (contador < numeros.length) {
            this.numeros[contador++] = numero;
        } else {
            int[] novoArray = new int[numeros.length * 2];
            System.arraycopy(numeros, 0, novoArray, 0, numeros.length);
            this.numeros = novoArray;
            this.numeros[contador++] = numero;
        }
    }

	public int somarTodos() {
		int soma = 0;

		for (int i = 0; i < this.numeros.length; i++) {
			soma += this.numeros[i];
		}

		return soma;
	}

	public int encontrarMaior() {
		int maior = this.numeros[0];

		for (int i = 0; i < this.numeros.length; i++) {
			if (this.numeros[i] > maior)
				maior = this.numeros[i];
		}

		return maior;
	}

	public int encontrarMenor() {
		int menor = this.numeros[0];

		for (int i = 0; i < this.numeros.length; i++) {
			if (this.numeros[i] < menor && this.numeros[i] > 0)
				menor = this.numeros[i];
		}

		return menor;
	}

	public static void main(String[] args) {
		ManipulaArray arrayInteiros = new ManipulaArray();
		Scanner sc = new Scanner(System.in);
		int selecao;
		do {
			System.out.println("Que operação deseja realizar?");
			System.out.println("1. Inserir número ");
			System.out.println("2. Somar todos números");
			System.out.println("3. Encontrar maior número");
			System.out.println("4. Encontrar menor número");
			System.out.println("0. Sair");
			System.out.print("R: ");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				System.out.print("Informe um número inteiro: ");
				arrayInteiros.setNumeros(sc.nextInt());
				System.out.println("número inserido com sucesso !");
				break;
			}
			case 2: {
				System.out.println("O resultado da soma de todos os número é: " + arrayInteiros.somarTodos());
				break;
			}
			case 3: {
				System.out.println("O maior número inserido é: " + arrayInteiros.encontrarMaior());
				break;
			}
			case 4: {
				System.out.println("O menor número inserido é: " + arrayInteiros.encontrarMenor());
				break;
			}
			case 0: {
				System.out.println("Aplicação finalizada.");
				break;
			}
			default: {
				System.out.println("Escolha inválida.");
				break;
			}
			}
		} while (selecao != 0);
	}
}
