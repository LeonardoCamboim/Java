package Animais;

import java.util.Date;

import App.Preenchimento;
import Pessoas.Responsavel;
import Pessoas.Veterinario;

// Toda classe extends Object implicitamente, diretamente ou indiretamente.
public abstract class Animal extends Object implements Preenchimento {
	
	private int          id = total;
	private String       nome;
	private String       raca;
	private final String sexo;
	private String       idade;
	private String       peso;
	private String       procedencia; 
	private Responsavel  responsavel;
	private Veterinario  veterinario;
	private static int   total;
	
	//Falta implementar atributo.
	private Date ultimaConsulta;
	
	public Animal(Responsavel responsavel, Veterinario veterinario, String sexo) {
		this.responsavel = responsavel;
		this.responsavel.validaAnimal(this);
		this.veterinario = veterinario;
		this.sexo = sexo;
		total++;
	}
	
	public Animal(String nome, Responsavel responsavel, Veterinario veterinario, String sexo) {
		this.nome = nome;
		this.responsavel = responsavel;
		this.responsavel.validaAnimal(this);
		this.veterinario = veterinario;
		this.sexo = sexo;
		Animal.total++;
	}

	public int getId() {
		return id;
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

	public String getIdade() {
		return idade;
	}
	public void setIdade(String string) {
		this.idade = string;
	}

	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
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
	
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	
	@Override
	public void preencherCampos() {
		setNome(solicitaDados("Nome"));
		setRaca(solicitaDados("Raça"));
		setIdade(solicitaDados("Idade"));
		setPeso(solicitaDados("Peso"));
		setProcedencia(solicitaDados("Procedencia")); 
	}
	
	@Override
	public String toString() {
		return String.format(" Animal id: %d nome: %s %n %s %n %s", getId(), getNome(), getResponsavel(), getVeterinario());
	}
}
