package entity;

import java.util.Date;

public class DataImportante {

	private String descricao;

	private Date data;

	private Date tempoAlerta;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getTempoAlerta() {
		return tempoAlerta;
	}

	public void setTempoAlerta(Date tempoAlerta) {
		this.tempoAlerta = tempoAlerta;
	}

}
