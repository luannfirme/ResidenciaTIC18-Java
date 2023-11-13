package usuario;

import java.util.ArrayList;
import java.util.Scanner;

import verbo.Verbo;

public class Usuario {
	private String nome, email, nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens, pontuacao;

	public Usuario(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		postagens = new ArrayList<String>();
		quantidadeDePostagens = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public ArrayList<String> getPostagens() {
		return postagens;
	}

	public void setPostagens(ArrayList<String> postagens) {
		this.postagens = postagens;
	}

	public void adicionaPostagem(String post) {
		this.quantidadeDePostagens++;
	}

	public void alteraPontucao(int delta) {
		this.pontuacao += delta;

		if (this.pontuacao <= 0)
			this.pontuacao = 0;

	}
	
	public void mostrarPostagens(ArrayList<String> postagens) {
		for(int i = 0; i < postagens.size(); i++) {
			System.out.println("Post " + i + ": " + postagens.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String sn;

		do {
			String nome, email, nacionalidade, postagem;
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o seu nome: ");
			nome = sc.nextLine();
			System.out.println("Digite o seu email: ");
			email = sc.nextLine();
			System.out.println("Digite a sua nacionalidade: ");
			nacionalidade = sc.nextLine();
			Usuario usuario = new Usuario(nome, email, nacionalidade);
			listaUsuarios.add(usuario);
			System.out.println("Deseja inserir um novo usuário? [s/n]: ");
			sn = sc.nextLine();
		} while (!"n".equals(sn));
	}

}
