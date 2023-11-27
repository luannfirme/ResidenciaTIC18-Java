package usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import listaSessoes.ListaSessoes;
import sessao.Sessao;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Date DataDeNascimento;
	private List<String> listaPostagens;
    private List<Sessao> listaSessoes;
    private List<Usuario> amigos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaPostagens = new ArrayList<>();
        this.listaSessoes = new ArrayList<>();
        this.amigos = new ArrayList<>();
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Date getDataDeNascimento() {
		return DataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}

    public List<String> getListaPostagens() {
        return listaPostagens;
    }

    public void setListaPostagens(List<String> listaPostagens) {
        this.listaPostagens = listaPostagens;
    }

    public List<Sessao> getListaSessoes() {
        return listaSessoes;
    }

    public void setListaSessoes(List<Sessao> listaSessoes) {
        this.listaSessoes = listaSessoes;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public void logar(ListaSessoes listaSessoes) {
        Sessao.logar(this, listaSessoes);
    }

    public void deslogar(ListaSessoes listaSessoes) {
        Sessao.deslogar(this, listaSessoes);
    }
}
