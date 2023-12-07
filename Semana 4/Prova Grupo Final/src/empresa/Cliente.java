package empresa;

public class Cliente {
	private String nome;
	private String cpf;
	private Imovel imovel;
	
	//Construtor
	public Cliente(String nome, String cpf, Imovel imovel) {
		this.nome = nome;
		this.cpf = cpf;
		this.imovel = imovel;
	}

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	/*
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	*/
	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
}
