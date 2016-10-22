package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Cliente;
import model.ContaBancaria;
import model.Contato;
import model.Endereco;
import model.Honorario;

public class ViewCrudCliente {
	
	private JFrame frame = new JFrame();
	private JPanel panelGeral = new JPanel();
	private JPanel panelForm = new JPanel();
	private JPanel panelAux = new JPanel();
	
	private JTextField txtNome = new JTextField();
	private JTextField txtApelido = new JTextField();
	private JTextField txtCnpj = new JTextField();
	private JTextField txtInscEst = new JTextField();
	private JTextField txtOutroDoc = new JTextField();
	private JButton btnEnd = new JButton(
			"Clique para cadastrar um endereço");
	private JButton btnContato = new JButton(
			"Clique para cadastrar um contato");
	private JButton btnContaBancaria = new JButton(
			"Clique para cadastrar uma conta bancária");
	private JButton btnHonorario = new JButton(
			"Clique para cadastrar um honorário");
	private JTextArea txtObs = new JTextArea();
	
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnPesquisar = new JButton ("Pesquisar");
	
	//Listas
	List<Endereco> lstEnd = new ArrayList<Endereco>();
	List<Contato> lstContatos = new ArrayList<Contato>();
	List<ContaBancaria> lstContas = new ArrayList<ContaBancaria>();
	List<Honorario> lstHonorarios = new ArrayList<Honorario>();
	
	/** 
	 * Construtor da view 
	 */
	public ViewCrudCliente() {
		criarMenu();
		criarTela();
		inicializarTela();
	}
	
	/**
	 * Método que cria o menu
	 */
	private void criarMenu() {
		Menu menuBar = new Menu();
		frame.setJMenuBar(menuBar.setMenu());	
	}
	
	/**
	 * Método que cira o formulário
	 */
	private void criarTela() {
		panelGeral.setBounds(0,0,900, 520);
		panelGeral.setLayout(new GridLayout(1, 2));
		
		criarForm();	
		
		panelGeral.add(panelForm);
		panelGeral.add(panelAux);
		
		
	}
	
	/**
	 * Método que popula o painel geral.
	 */
	private void criarForm() {
		GridLayout gl = new GridLayout(11, 2);
		gl.setHgap(20);
		gl.setVgap(10);
		panelForm.setLayout(gl);
		panelForm.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JLabel lblNome = new JLabel("Nome do Cliente");
		panelForm.add(lblNome);
		panelForm.add(txtNome);
		
		JLabel lblApelido = new JLabel("\"Apelido\"");
		panelForm.add(lblApelido);
		panelForm.add(txtApelido);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		panelForm.add(lblCnpj);
		panelForm.add(txtCnpj);
		
		JLabel lblInscEst = new JLabel("Inscrição Estadual");
		panelForm.add(lblInscEst);
		panelForm.add(txtInscEst);
		
		JLabel lblOutroDoc = new JLabel("Outro Documento");
		panelForm.add(lblOutroDoc);
		panelForm.add(txtOutroDoc);
		
		JLabel lblEnd = new JLabel("Endereços");
		panelForm.add(lblEnd);
		panelForm.add(btnEnd);

		JLabel lblContato = new JLabel("Contatos");
		panelForm.add(lblContato);
		panelForm.add(btnContato);
		
		JLabel lblContaBancaria = new JLabel("Contas Bancarias");
		panelForm.add(lblContaBancaria);
		panelForm.add(btnContaBancaria);
		
		JLabel lblHonorario = new JLabel("Honorarios");
		panelForm.add(lblHonorario);
		panelForm.add(btnHonorario);
		
		JLabel lblObs = new JLabel("Obs.");
		JScrollPane scroll = new JScrollPane(txtObs);
		panelForm.add(lblObs);
		panelForm.add(scroll);

		panelForm.add(btnPesquisar);
		panelForm.add(btnSalvar);
		
	}
		
	/**
	 * Metodo que inicializa a tela
	 */
	private void inicializarTela() {
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panelGeral);
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	/**
	 * Método que coloca os itens do formulário na classe model
	 * @return Cliente c
	 */
	private Cliente formToCliente(){
		Cliente c = new Cliente();
		
		c.setNomeItvnt(txtNome.getText());
		c.setApelidoItvnt(txtApelido.getText());
		c.setCnpj(Integer.parseInt(txtCnpj.getText()));
		c.setInscricaoEstadual(Integer.parseInt(txtInscEst.getText()));
		c.setOutroDocumento(txtOutroDoc.getText());
		c.setObservacoes(txtObs.getText());
		c.setEndereco(lstEnd);
		c.setContato(lstContatos);
		c.setContasBancarias(lstContas);
		c.setHonorarios(lstHonorarios);
		
		return c;
	}
	
	/**
	 * Metodo que coloca os dados de Cliente na tela
	 * @param Cliente c
	 */
	private void clienteToForm(Cliente c){
		txtNome.setText(c.getNomeItvnt());
		txtApelido.setText(c.getApelidoItvnt());
		txtCnpj.setText(String.valueOf(c.getCnpj()));
		txtInscEst.setText(String.valueOf(c.getInscricaoEstadual()));
		txtOutroDoc.setText(c.getOutroDocumento());
		txtObs.setText(c.getObservacoes());
		lstEnd = c.getEndereco();
		lstContatos = c.getContato();
		lstContas = c.getContasBancarias();
		lstHonorarios = c.getHonorarios();
	}
	
}
