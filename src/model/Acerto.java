package model;

import java.util.Date;
import java.util.List;

public class Acerto {

	private String numeroAcerto;
	private Date dataEmissaoAcerto;
	private List<Fatura> faturas;
	private String observacoes;
	private Date dataConclusaoAcerto;
	
	//getters&setters
	public String getNumeroAcerto() {
		return numeroAcerto;
	}
	public void setNumeroAcerto(String numeroAcerto) {
		this.numeroAcerto = numeroAcerto;
	}
	public Date getDataEmissaoAcerto() {
		return dataEmissaoAcerto;
	}
	public void setDataEmissaoAcerto(Date dataEmissaoAcerto) {
		this.dataEmissaoAcerto = dataEmissaoAcerto;
	}
	public List<Fatura> getFaturas() {
		return faturas;
	}
	public void setFaturas(List<Fatura> faturas) {
		this.faturas = faturas;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Date getDataConclusaoAcerto() {
		return dataConclusaoAcerto;
	}
	public void setDataConclusaoAcerto(Date dataConclusaoAcerto) {
		this.dataConclusaoAcerto = dataConclusaoAcerto;
	}
}
