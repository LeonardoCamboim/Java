package PetDream;

import java.util.Scanner;

public class Animal {
	
	private String nome;
	private String especie;
	private String raca;
	private String sexo;
	private int idade;
	private Double peso;
	private String pelagem;
	private String procedencia;
	private Responsavel responsavel;
	
	public Animal(Responsavel responsavel) {
		// TODO Auto-generated constructor stub
		this.responsavel = responsavel;
		this.preencherAnimal();
	}

	public void preencherAnimal() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome: ");
		this.nome = scanner.toString();
		
		System.out.println("Especie: ");
		this.especie = scanner.toString();
		
		System.out.println("Raca: ");
		this.raca = scanner.toString();
		
		System.out.println("Sexo: ");
		this.sexo = scanner.toString();
		
		System.out.println("Idade: ");
		this.idade = scanner.nextInt();
		
		System.out.println("Peso: ");
		this.peso = scanner.nextDouble();
		
		System.out.println("Pelagem: ");
		this.pelagem = scanner.toString();
		
		System.out.println("Procedencia: ");
		this.procedencia = scanner.toString();
		
		scanner.close();
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

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
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

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
}
