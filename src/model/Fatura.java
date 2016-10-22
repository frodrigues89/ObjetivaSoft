package model;

import java.util.Date;
import java.util.List;

public class Fatura {

	private int codigo;
	private String numeroNFe;
	private Processo processo;
	private Date dataFatura;
	private Date dataVencimento;
	private Double totalGastos;
	private List<Imposto> impostos;

	
	//getters&setters
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumeroNFe() {
		return numeroNFe;
	}

	public void setNumeroNFe(String numeroNFe) {
		this.numeroNFe = numeroNFe;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Date getDataFatura() {
		return dataFatura;
	}

	public void setDataFatura(Date dataFatura) {
		this.dataFatura = dataFatura;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getTotalGastos() {
		return totalGastos;
	}

	public void setTotalGastos(Double totalGastos) {
		this.totalGastos = totalGastos;
	}

	public List<Imposto> getImpostos() {
		return impostos;
	}

	public void setImpostos(List<Imposto> impostos) {
		this.impostos = impostos;
	}

	
	//metodos de domínio
	private Date calculaDataVencimento(Date dataFatura) {
		return null;
	}

	public Double calcularImpostos() {
		return null;
	}

	public Double calcularSaldoFatura(Double totalGastos) {
		return null;
	}

}
