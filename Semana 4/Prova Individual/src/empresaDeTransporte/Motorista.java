package empresaDeTransporte;

public class Motorista {
	private String Nome;
	private int	AnoDeAdmissao;
	private String Cpf;
	private String Ctps;
	
	public void CadastroDeMotorista(Motorista novoMotorista) {
		this.Nome = novoMotorista.Nome;
		this.AnoDeAdmissao = novoMotorista.AnoDeAdmissao;
		this.Cpf = novoMotorista.Cpf;
		this.Ctps = novoMotorista.Ctps;
	}
}
