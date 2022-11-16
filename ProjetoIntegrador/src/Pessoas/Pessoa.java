package Pessoas;

import Endereco.Bairro; 
import Endereco.Cidade;
import Endereco.Estado;
import Endereco.Rua;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private Rua rua;
	private Bairro bairro;
	private Cidade cidade;
	private Estado estado;
	private String telefoneFixo;
	private String celular;
	
	public Pessoa(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		try {
			
			IllegalArgumentException erro = new IllegalArgumentException();
			
			if (cpf.length() == 9) {
				this.cpf = cpf;
			} else {
				throw erro;
			}
				
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException: O CPF deve conter apenas numeros contendo nove digitos.");
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Rua getRua() {
		return rua;
	}
	public void setRua(Rua rua) {
		this.rua = rua;
	}

	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
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
	public String toString() {
		return String.format("Nome= %s - Cpf= %s", getNome(), getCpf());
	}
}
