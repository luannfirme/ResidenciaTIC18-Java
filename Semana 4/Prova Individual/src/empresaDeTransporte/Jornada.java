package empresaDeTransporte;

import java.util.ArrayList;
import java.util.Optional;

public class Jornada {
	private Veiculo Veiculo;
	private Motorista Motorista;
	private Optional<Cobrador> Cobrador;
	private ArrayList<Trajeto> Trajetos;
	
	
	public void RegistroDeJornadas(Jornada jornada) {
		this.Veiculo = jornada.Veiculo;
		this.Motorista = jornada.Motorista;
		this.Cobrador = jornada.Cobrador;
		this.Trajetos = jornada.Trajetos;
	}
}
