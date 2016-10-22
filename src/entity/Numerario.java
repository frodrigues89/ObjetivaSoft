package entity;

import java.util.List;
import java.util.Date;

public class Numerario {

	private int codigo;

	private Processo processo;

	private Moeda moeda;

	private Double taxaDolar;

	private List<Despesa> despesas;

	private Double valorTotal;

	private List<String> observacoes;

	private Date data;

	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Moeda getMoeda() {
		return moeda;
	}

	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}

	public Double getTaxaDolar() {
		return taxaDolar;
	}

	public void setTaxaDolar(Double taxaDolar) {
		this.taxaDolar = taxaDolar;
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<Despesa> despesas) {
		this.despesas = despesas;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<String> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<String> observacoes) {
		this.observacoes = observacoes;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double calculaTotal(List despesas) {
		return null;
	}

	public Double calculaTaxaDolar() {
		return null;
	}

}
