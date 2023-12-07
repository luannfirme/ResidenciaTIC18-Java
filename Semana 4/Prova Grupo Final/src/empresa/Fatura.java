package empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fatura {
	private String id;
	private LocalDate data;
	private float ultimaLeitura;
	private float penultimaLeitura;
	private float valor;
	private boolean estadoPagamento = false;
	private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	//Construtor
	public Fatura(String id, LocalDate data, float ultimaLeitura, float penultimaLeitura, float valor) {
		this.id = id;
		this.data = data;
		this.ultimaLeitura = ultimaLeitura;
		this.penultimaLeitura = penultimaLeitura;
		this.valor = valor;
	}
	
	//Getters e Setters
	public String getId() {
		return id;
	}
	
	/*
	public void setId(String id) {
		this.id = id;
	}
	*/
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public float getUltimaLeitura() {
		return ultimaLeitura;
	}
	
	public void setUltimaLeitura(float ultimaLeitura) {
		this.ultimaLeitura = ultimaLeitura;
	}
	
	public float getPenultimaLeitura() {
		return penultimaLeitura;
	}
	
	public void setPenultimaLeitura(float penultimaLeitura) {
		this.penultimaLeitura = penultimaLeitura;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public boolean isEstadoPagamento() {
		return estadoPagamento;
	}
	
	public void setEstadoPagamento(boolean estadoPagamento) {
		this.estadoPagamento = estadoPagamento;
	}
	
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}
	
	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}


}
