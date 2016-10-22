package entity;

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

	private List despesas;

	public Double calcularHonorario(Double valorCif) {
		return null;
	}

}
