package Semana4;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private String dataHoraInicio;
    private String dataHoraFim;

    public Sessao(String dataHoraInicio, String dataHoraFim) {
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    public static void logar() {
        // Lógica de login de sessão
    }

    public static void deslogar() {
        // Lógica de logout de sessão
    }

    public void solicitaAutenticacao() {
        // Lógica de autenticação
    }

    public void criarAmizade(Usuario usuario1, Usuario usuario2) {
        usuario1.adicionarAmigo(usuario2);
        usuario2.adicionarAmigo(usuario1);
    }

    public void desfazerAmizade(Usuario usuario1, Usuario usuario2) {
        usuario1.removerAmigo(usuario2);
        usuario2.removerAmigo(usuario1);
    }

    public void criarPostagem(Usuario usuario, String conteudo) {
        Postagem postagem = new Postagem(usuario, conteudo);
        usuario.listaPostagens.add(postagem);
    }

    public void listarPostagens(Usuario usuario) {
        for (Postagem postagem : usuario.listaPostagens) {
            // Exibir informações da postagem
        }
    }
}
