package empresa;

import java.time.LocalDate;

public class Pagamento {
	private float valor;
	private LocalDate data;
	private Reembolso reembolso;
	
	//Construtor
	public Pagamento(float valor, LocalDate data) {
		this.valor = valor;
		this.data = data;
	}
	
	public Pagamento() {
		super();
	}


	//Getters e Setters
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}	
	
	public Reembolso getReembolso() {
		return reembolso;
	}

	public void setReembolso(Reembolso reembolso) {
		this.reembolso = reembolso;
	}
}
