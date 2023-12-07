package empresa;

import java.time.LocalDate;

public class Reparo {
	private String descricao;
	private LocalDate previsao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private boolean estadoResolvido = false;
	
	//Construtor
	public Reparo(String descricao, LocalDate previsao, LocalDate dataInicio, LocalDate dataFim) {
		this.descricao = descricao;
		this.previsao = previsao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	//Getters e Setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getPrevisao() {
		return previsao;
	}

	public void setPrevisao(LocalDate previsao) {
		this.previsao = previsao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public boolean isEstadoResolvido() {
		return estadoResolvido;
	}

	public void setEstadoResolvido(boolean estadoResolvido) {
		this.estadoResolvido = estadoResolvido;
	}
}
