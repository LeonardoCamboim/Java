package Endereco;

import java.util.ArrayList;

public abstract class Pais {
	
	private String nome;
	private String zona;
	private int populacao;
	private static ArrayList<Estado> estados = new ArrayList<Estado>();
	
	public Pais(String nome) {
		this.nome = nome;
	}
	
	public void addEstado(Estado estado) {
		estados.add(estado);
		System.out.println("O estado foi adicionado a lista de localidades.");
	}
	public static ArrayList<Estado> getEstados() {
		return estados;
	}

	public String getNome() {
		return nome;
	}

	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}

	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s - Zona: %s - População: %d", getNome(), getZona(), getPopulacao());
	}
}
