package empresaDeTransporte;

public class Trecho {
	private PontoParada Origem;
	private PontoParada Destino;
	private int TempoEstimado;
	
	public PontoParada getOrigem() {
		return Origem;
	}
	public void setOrigem(PontoParada origem) {
		this.Origem = origem;
	}
	public PontoParada getDestino() {
		return Destino;
	}
	public void setDestino(PontoParada destino) {
		this.Destino = destino;
	}
	public int getTempoEstimado() {
		return TempoEstimado;
	}
	public void setTempoEstimado(int tempoEstimado) {
		this.TempoEstimado = tempoEstimado;
	}
}
