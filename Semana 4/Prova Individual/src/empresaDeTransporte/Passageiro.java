package empresaDeTransporte;

public class Passageiro {
	private String Nome;
	private String Cpf;
	private String Tipo;
	
	public void CadastroDePassageiro(Passageiro novoPassageiro) {
		this.Nome = novoPassageiro.Nome;
		this.Cpf = novoPassageiro.Cpf;
		this.Tipo = novoPassageiro.Tipo;
	}
}
