package empresaDeTransporte;

import java.time.LocalTime;

public class Checkpoint {
	private PontoParada Parada;
	private LocalTime Horario;
	
	public void RegistroDeCheckpoint(PontoParada parada) {
		this.Parada = parada;
		this.Horario = LocalTime.now();
	}
}
