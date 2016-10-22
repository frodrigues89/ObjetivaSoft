package model;

public class Veiculo {
	private String placa;
	private String Modelo;
	private String Marca;
	private TipoDeVeiculo tipoDeVeiculo;
	
	//getters&setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public TipoDeVeiculo getTipoDeVeiculo() {
		return tipoDeVeiculo;
	}
	public void setTipoDeVeiculo(TipoDeVeiculo tipoDeVeiculo) {
		this.tipoDeVeiculo = tipoDeVeiculo;
	}
	
	
}
