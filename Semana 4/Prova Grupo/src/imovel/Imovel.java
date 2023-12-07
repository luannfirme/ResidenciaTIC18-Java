package imovel;


public class Imovel {
	private String Matricula;
	private String Endereco;
	private int UltimaLeitura;
	private int PenultimaLeitura;
	
	public Imovel(String matricula, String endereco) {
        this.Matricula = matricula;
        this.Endereco = endereco;
        this.UltimaLeitura = 0;
        this.PenultimaLeitura = 0;
    }
	
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public int getUltimaLeitura() {
		return UltimaLeitura;
	}
	public void setUltimaLeitura(int ultimaLeitura) {
		UltimaLeitura = ultimaLeitura;
	}
	public int getPenultimaLeitura() {
		return PenultimaLeitura;
	}
	public void setPenultimaLeitura(int penultimaLeitura) {
		PenultimaLeitura = penultimaLeitura;
	}
}
