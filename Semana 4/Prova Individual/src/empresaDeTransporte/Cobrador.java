package empresaDeTransporte;

public class Cobrador {
	private String Nome;
	private int	AnoDeAdmissao;
	private String Cpf;
	private String Ctps;
	
	public void CadastroDeCobrador(Cobrador novoCobrador) {
		this.Nome = novoCobrador.Nome;
		this.AnoDeAdmissao = novoCobrador.AnoDeAdmissao;
		this.Cpf = novoCobrador.Cpf;
		this.Ctps = novoCobrador.Ctps;

	}
}
