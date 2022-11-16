package Animais;

import java.util.Date;

import Pessoas.Responsavel;

public abstract class Animal {
	
	private int matricula = 100000 + total;
	private String nome;
	private String especie;
	private String raca;
	private String sexo;
	private int idade;
	private Double peso;
	private String procedencia;
	private Responsavel responsavel;
	private int indexArrayDoResponsavel;
	private static int total;
	
	//Falta implementar atributo.
	private Date ultimaConsulta;
	
	public Animal(Responsavel responsavel) {
		this.responsavel = responsavel;
		// TODO Auto-generated constructor stub
		Animal.total++;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public void setIndexArrayDoResponsavel(int indexArrayDoResponsavel) {
		this.indexArrayDoResponsavel = indexArrayDoResponsavel;
	}
	public int getIndexArrayDoResponsavel() {
		return indexArrayDoResponsavel;
	}

	@Override
	public String toString() {
		return String.format(" [Animal(%d) nome= %s - %s - especie = %s]%n", getIndexArrayDoResponsavel(), getNome(),
				getResponsavel(), getEspecie());
	}
}
