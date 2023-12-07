package empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Falha {
	private String descricao;
	private LocalDate previsao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private String tipoFalha; // acho que e melhor do que criar duas classes 
	private List<Reparo> reparos = new ArrayList<Reparo>();
	
	
	//Construtor
	public Falha(String descricao, LocalDate previsao, LocalDate dataInicio, LocalDate dataFim, String tipoFalha) {
		this.descricao = descricao;
		this.previsao = previsao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.tipoFalha = tipoFalha;
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
	
	public String getTipoFalha() {
		return tipoFalha;
	}
	
	public void setTipoFalha(String tipoFalha) {
		this.tipoFalha = tipoFalha;
	}
	
	public List<Reparo> getReparos() {
		return reparos;
	}
	
	public void setReparos(List<Reparo> reparos) {
		this.reparos = reparos;
	}
	
	
}
