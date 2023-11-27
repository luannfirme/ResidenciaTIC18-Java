package listaUsuarios;

import java.util.ArrayList;
import java.util.List;

import usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    private String nomeDaLista;
    private List<Usuario> usuarios;

    public ListaUsuarios(String nomeDaLista) {
        this.nomeDaLista = nomeDaLista;
        this.usuarios = new ArrayList<>();
    }

    public String getNomeDaLista() {
        return nomeDaLista;
    }

    public void setNomeDaLista(String nomeDaLista) {
        this.nomeDaLista = nomeDaLista;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void criarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }
}
