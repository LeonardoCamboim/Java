package Animais;

import java.util.Date;
import Pessoas.Responsavel;

// Toda classe extends Object implicitamente, diretamente ou indiretamente.
public abstract class Animal extends Object {
	
	private int          matricula = 100000 + total;
	private String       nome;
	private String       raca;
	private final String sexo;
	private int          idade;
	private Double       peso;
	private String       procedencia;
	private Responsavel  responsavel;
	private int          indexArrayDoResponsavel;
	private static int   total;
	
	//Falta implementar atributo.
	private Date ultimaConsulta;
	
	public Animal(Responsavel responsavel, String sexo) {
		this.responsavel = responsavel;
		this.sexo = sexo;
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

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	

	public String getSexo() {
		return sexo;
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
		return String.format(" [Animal(%d) nome= %s - %s", getIndexArrayDoResponsavel(), getNome() 
				,getResponsavel());
	}
	
	public final void metodoTeste(final double a) {
		this.matricula += a;
	}

}
