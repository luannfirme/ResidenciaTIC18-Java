package cliente;

import java.util.ArrayList;
import java.util.List;

import imovel.Imovel;

public class Cliente {
	private String Cpf;
	private String Nome;
	private List<Imovel> Imoveis;
	
	public Cliente(String cpf, String nome) {
		this.Cpf = cpf;
		this.Nome = nome;
		this.Imoveis = new ArrayList<>();
	}
	
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public List<Imovel> getImoveis() {
		return Imoveis;
	}
	public void setImoveis(Imovel imovel) {
		this.Imoveis.add(imovel);
	}
	
	public void removeImoveis(Imovel imovel) {
		this.Imoveis.remove(imovel);
	}
}
