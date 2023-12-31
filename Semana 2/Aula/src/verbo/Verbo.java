package verbo;

import java.util.Scanner;

public class Verbo {
	private String radical, sufixo;
	
	public Verbo(String _radical, String _sufixo) {
		super();
		this.radical = _radical;
		this.sufixo = _sufixo;
	}

	public String getRadical() {
		return radical;
	}

	public void setRadical(String radical) {
		this.radical = radical;
	}

	public String getSufixo() {
		return sufixo;
	}

	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}

	public void conjugar() {
		System.out.println("Eu " + radical + "o");
		System.out.println("Tu " + radical + "as");
		System.out.println("Ele " + radical + "a");
		System.out.println("Nos " + radical + "amos");
		System.out.println("Vos " + radical + "ais");
		System.out.println("Eles " + radical + "am");
	}
	
	public static void main(String[] args) {
		String rad, suf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o radical: ");
		rad = sc.nextLine();
		System.out.println("Digite o sufixo: ");
		suf = sc.nextLine();
		Verbo verbo = new Verbo(rad, suf);
		verbo.conjugar();
	}
}
