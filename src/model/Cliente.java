package model;

import java.util.List;

public class Cliente extends Interveniente {

	private List<Honorario> honorarios;
	private Double saldo;

	//getters & setters
	public List<Honorario> getHonorarios() {
		return honorarios;
	}
	public void setHonorarios(List<Honorario> honorarios) {
		this.honorarios = honorarios;
	}

	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	//metodos de domínio
	public Double calcularSaldo() {
		return null;
	}
}
