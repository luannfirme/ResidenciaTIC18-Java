package Semana4;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Postagem> listaPostagens;
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

    public void logar() {
        // Lógica de login
    }

    public void deslogar(Sessao sessao) {
        // Lógica de logout
    }

    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public void removerAmigo(Usuario amigo) {
        amigos.remove(amigo);
    }
}

