package empresaDeTransporte;

public class Veiculo {
	private String Registro;
	private String Placa;
	private String Fabricante;
	private String Modelo;
	private int QuantidadeDeAcentos;
	private	int Quilometragem;
	
	public void CadastroDeVeiculo(Veiculo novoVeiculo) {
		this.Registro = novoVeiculo.Registro;
		this.Fabricante = novoVeiculo.Fabricante;
		this.Placa = novoVeiculo.Modelo;
		this.Modelo = novoVeiculo.Placa;
		this.QuantidadeDeAcentos = novoVeiculo.QuantidadeDeAcentos;
		this.Quilometragem = novoVeiculo.Quilometragem;

	}
}
