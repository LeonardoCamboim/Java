package Pessoas;

import App.Preenchimento;

public abstract class Pessoa extends Object implements Preenchimento {
	
	private int          matricula = total;
	private String       nome;
	private final String cpf;
	private String       rua;
	private String       bairro;
	private String       cidade;
	private String       estado;
	private String       telefoneFixo;
	private String       celular;
	private static int   total;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		validaCpf(cpf);
		this.cpf = cpf;
		this.total++;
	}
	
	//Metodo auxiliar do construtor da classe. 
	//Private para que nao possa ser sobrescrito e gerar erro no construtor superclass.
	private static void validaCpf(String cpf) {	
		if (cpf.length() != 11) {
			throw new IllegalArgumentException("IllegalArgumentException: "
					+ "O CPF deve conter apenas numeros contendo nove digitos.");
		}
	}
	
	public int getMatricula() {
		return matricula;
	}

	public static int getTotal() {
		return total;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public void preencherCampos() {
		setRua(solicitaDados("Rua"));
		setBairro(solicitaDados("Bairro"));
		setCidade(solicitaDados("Cidade"));
		setEstado(solicitaDados("Estado"));
		setTelefoneFixo(solicitaDados("Telefone Fixo"));
		setCelular(solicitaDados("Celular"));
	}
	
	@Override
	public String toString() {
		return String.format("Matricula: %d Nome: %s Cpf: %s", 
				getMatricula(), getNome(), getCpf());
	}
}
