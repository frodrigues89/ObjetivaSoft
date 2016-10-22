package model;

import java.util.List;

public class CompanhiaTransporte extends Interveniente {

	private List<LocalAlfandegario> locaisDeAtuacao;

	private List<Veiculo> veiculo;

	public List<LocalAlfandegario> getLocaisDeAtuacao() {
		return locaisDeAtuacao;
	}

	public void setLocaisDeAtuacao(List<LocalAlfandegario> locaisDeAtuacao) {
		this.locaisDeAtuacao = locaisDeAtuacao;
	}

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}

	
	
	public List<Veiculo> carregaListaVeiculos() {
		return null;
	}

}
