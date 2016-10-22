package entity;

import java.util.List;

public class Interveniente {

	private TipoInterveniente tipoInterveniente;

	private int codigoItvnt;

	private String nomeItvnt;

	private String apelidoItvnt;

	private List<Endereco> endereco;

	private int cnpj;

	private int inscricaoEstadual;

	private String outroDocumento;

	private List<Contato> contato;

	private List<ContaBancaria> contasBancarias;

	private List<DataImportante> datasImportantes;

	private String observacoes;

	public TipoInterveniente getTipoInterveniente() {
		return tipoInterveniente;
	}

	public void setTipoInterveniente(TipoInterveniente tipoInterveniente) {
		this.tipoInterveniente = tipoInterveniente;
	}

	public int getCodigoItvnt() {
		return codigoItvnt;
	}

	public void setCodigoItvnt(int codigoItvnt) {
		this.codigoItvnt = codigoItvnt;
	}

	public String getNomeItvnt() {
		return nomeItvnt;
	}

	public void setNomeItvnt(String nomeItvnt) {
		this.nomeItvnt = nomeItvnt;
	}

	public String getApelidoItvnt() {
		return apelidoItvnt;
	}

	public void setApelidoItvnt(String apelidoItvnt) {
		this.apelidoItvnt = apelidoItvnt;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(int inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getOutroDocumento() {
		return outroDocumento;
	}

	public void setOutroDocumento(String outroDocumento) {
		this.outroDocumento = outroDocumento;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	public List<ContaBancaria> getContasBancarias() {
		return contasBancarias;
	}

	public void setContasBancarias(List<ContaBancaria> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}

	public List<DataImportante> getDatasImportantes() {
		return datasImportantes;
	}

	public void setDatasImportantes(List<DataImportante> datasImportantes) {
		this.datasImportantes = datasImportantes;
	}

}
