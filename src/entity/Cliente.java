package entity;

import java.util.List;

public class Cliente extends Interveniente {

	private List<Honorario> honorarios;

	private Double saldo;

	
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


	public Double calcularSaldo() {
		return null;
	}

}
