package empresaDeTransporte;

import java.util.ArrayList;
import java.time.LocalTime;

public class Trajeto {
	private ArrayList<Passageiro> Passageiros;
	private ArrayList<Trecho> Trechos;
	private Checkpoint PontoFinal;
	private Jornada Jornada;
	private LocalTime Inicio;
	
	public void CadastroDeTrajeto(Trajeto novoTrajeto) {
		this.Passageiros = new ArrayList<Passageiro>();
		this.Trechos = novoTrajeto.Trechos;
		this.PontoFinal = novoTrajeto.PontoFinal;
		this.Jornada = novoTrajeto.Jornada;
	}
	
	public void InciarTrajeto() {
		this.Inicio = LocalTime.now();
	}
	
	public void RegistroDeEmbarque(Passageiro passageiro) {
		this.Passageiros.add(passageiro);
	}
	
	public void RegistroDeCheckpoint() {
		this.PontoFinal.RegistroDeCheckpoint(Trechos.get(Trechos.size() - 1).getDestino());
	}
}
