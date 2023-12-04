package empresaDeTransporte;

public class PontoParada {
	private String Nome;
	private String Referencia;
	
	public void CadastroDePontoParada(PontoParada novoPontoParada) {
		this.Nome = novoPontoParada.Nome;
		this.Referencia = novoPontoParada.Referencia;
	}
}