package usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Usuario {
	private UUID Id;
	private String Nome, Email, Senha;
	private Date DataDeNascimento;
	private ArrayList<String> Postagens;
	private ArrayList<Usuario> Amigos;

	public Usuario(String nome, String email) {
		super();
		this.Id = java.util.UUID.randomUUID();
		this.Nome = nome;
		this.Email = email;
		Postagens = new ArrayList<String>();
		Amigos =  new ArrayList<Usuario>();
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}
	
	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		this.Senha = senha;
	}

	public ArrayList<String> listaPostagens() {
		return Postagens;
	}
	
	public void novaPostagem(String postagem) {
		this.Postagens.add(postagem);
    }
	
	/*public void listaPostagens() {
		for(int i = 0; i < this.Postagens.size(); i++) {
			System.out.println(this.Nome + " :" + i + ": " + this.Postagens.get(i));
		}
	}*/
	
	public void criarAmizade(Usuario amigo) {
		this.Amigos.add(amigo);
		amigo.Amigos.add(this);
	}
	
	public void destruirAmizade(Usuario amigo) {
		this.Amigos.remove(amigo);
		amigo.Amigos.remove(this);
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
			/*listaUsuarios.add(usuario);*/
			System.out.println("Deseja inserir um novo usuário? [s/n]: ");
			sn = sc.nextLine();
		} while (!"n".equals(sn));
	}

}
