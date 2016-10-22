package entity;

public class Honorario {

	private Double valorMinimo;

	private Double valorMaximo;

	private int percentual;

	private String observacoesHonorario;

	public Double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(Double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public Double getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public int getPercentual() {
		return percentual;
	}

	public void setPercentual(int percentual) {
		this.percentual = percentual;
	}

	public String getObservacoesHonorario() {
		return observacoesHonorario;
	}

	public void setObservacoesHonorario(String observacoesHonorario) {
		this.observacoesHonorario = observacoesHonorario;
	}

}
