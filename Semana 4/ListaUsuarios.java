package Semana4;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    private String nomeDaLista;
    private List<Usuario> usuarios;

    public ListaUsuarios(String nomeDaLista) {
        this.nomeDaLista = nomeDaLista;
        this.usuarios = new ArrayList<>();
    }

    public void criarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
}

