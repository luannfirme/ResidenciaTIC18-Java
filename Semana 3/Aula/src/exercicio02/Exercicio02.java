package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
	private float nota1, nota2, nota3, peso1, peso2, peso3;

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public void setPeso1(float peso1) {
		this.peso1 = peso1;
	}

	public void setPeso2(float peso2) {
		this.peso2 = peso2;
	}

	public void setPeso3(float peso3) {
		this.peso3 = peso3;
	}
	
	public void calcular() {
		float resultado = ((this.nota1 * this.peso1) + (this.nota2 * this.peso2) + (this.nota3 * this.peso3))/(this.peso1 + this.peso2 + this.peso3);;
		System.out.println("A média ponderada foi: " + resultado);
	}
	
	public static void main(String[] args) {
		Exercicio02 exec = new Exercicio02();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o peso da primeira nota: ");
		exec.setPeso1(sc.nextFloat());
		System.out.println("Insira o peso da segunda nota: ");
		exec.setPeso2(sc.nextFloat());
		System.out.println("Insira o peso da terceira nota: ");
		exec.setPeso3(sc.nextFloat());
		
		System.out.println("Insira a primeira nota: ");
		exec.setNota1(sc.nextFloat());
		System.out.println("Insira a segunda nota: ");
		exec.setNota2(sc.nextFloat());
		System.out.println("Insira a terceira nota: ");
		exec.setNota3(sc.nextFloat());

		
		exec.calcular();

	}
}
