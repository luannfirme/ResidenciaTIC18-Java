package listaUsuario;

import java.util.ArrayList;

import usuario.Usuario;

public class ListaUsuario {
	private ArrayList<Usuario> Usuarios;
	
	public void criarUsuario(Usuario usuario) {
		Usuarios.add(usuario);
	}
	
	public void  removerUsuario(Usuario usuario) {
	/*	for(int i = 0; i < this.Postagens.size(); i++) {
			System.out.println(this.Nome + " :" + i + ": " + this.Postagens.get(i));
		} */
		Usuarios.remove(usuario);
	}
}
