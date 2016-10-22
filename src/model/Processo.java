package model;

import java.util.Date;
import java.util.List;

public class Processo {

	private Date dataAbertura;
	private TipoDeProcesso tipoProcesso;
	private String numeroProcesso;
	private Cliente cliente;
	private LocalAlfandegario localAlfandegario;
	private IntervenienteNoExterior intervenienteNoExterior;
	private Double valorCIF;
	private Double honorario;
	private String refCliente;
	private String invoice;
	private String house;
	private String master;
	private String documento;
	private AgenteDeCarga agenteDeCarga;
	private String veiculoDeTransporte;
	private StatusProcesso status;
	private String ncm;
	private List<Despesa> despesas;

	//getters&setters
	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public TipoDeProcesso getTipoProcesso() {
		return tipoProcesso;
	}

	public void setTipoProcesso(TipoDeProcesso tipoProcesso) {
		this.tipoProcesso = tipoProcesso;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalAlfandegario getLocalAlfandegario() {
		return localAlfandegario;
	}

	public void setLocalAlfandegario(LocalAlfandegario localAlfandegario) {
		this.localAlfandegario = localAlfandegario;
	}

	public IntervenienteNoExterior getIntervenienteNoExterior() {
		return intervenienteNoExterior;
	}

	public void setIntervenienteNoExterior(IntervenienteNoExterior intervenienteNoExterior) {
		this.intervenienteNoExterior = intervenienteNoExterior;
	}

	public Double getValorCIF() {
		return valorCIF;
	}

	public void setValorCIF(Double valorCIF) {
		this.valorCIF = valorCIF;
	}

	public Double getHonorario() {
		return honorario;
	}

	public void setHonorario(Double honorario) {
		this.honorario = honorario;
	}

	public String getRefCliente() {
		return refCliente;
	}

	public void setRefCliente(String refCliente) {
		this.refCliente = refCliente;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public AgenteDeCarga getAgenteDeCarga() {
		return agenteDeCarga;
	}

	public void setAgenteDeCarga(AgenteDeCarga agenteDeCarga) {
		this.agenteDeCarga = agenteDeCarga;
	}

	public String getVeiculoDeTransporte() {
		return veiculoDeTransporte;
	}

	public void setVeiculoDeTransporte(String veiculoDeTransporte) {
		this.veiculoDeTransporte = veiculoDeTransporte;
	}

	public StatusProcesso getStatus() {
		return status;
	}

	public void setStatus(StatusProcesso status) {
		this.status = status;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<Despesa> despesas) {
		this.despesas = despesas;
	}
	
	//métodos de domínio
	public Double calcularHonorario(Double valorCif) {
		return null;
	}
}
