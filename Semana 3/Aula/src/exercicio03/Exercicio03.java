package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
	private String palavra1, palavra2;
	
	public void setPalavra1(String palavra1) {
		this.palavra1 = palavra1;
	}
	public void setPalavra2(String palavra2) {
		this.palavra2 = palavra2;
	}
	
	public void concatenar() {
		String palavra3;
		palavra3 = this.palavra1.concat(this.palavra2);
		System.out.println("o resultado da concatenação foi: " + palavra3);
	}
	
	public static void main(String[] args){
		Exercicio03 exec = new Exercicio03();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a primeira string: ");
		exec.setPalavra1(sc.nextLine());
		
		System.out.println("Insira a segunda string: ");
		exec.setPalavra2(sc.nextLine());
		
		exec.concatenar();
	}
}
