package empresa;

import java.time.LocalDate;

public class Reembolso {
	private float valor;
    private LocalDate data;
    
    //Construtor
    public Reembolso(float valor, LocalDate data) {
		this.valor = valor;
		this.data = data;
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
    
    
}
