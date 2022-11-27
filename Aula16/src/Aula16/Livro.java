package Aula16;

import java.util.Scanner;

public class Livro extends Object {
	
	private int    id;
	private String titulo;
	private String autor;
	private String anoDePublicacao;
	private String editora;
	
	private static Scanner sc = new Scanner(System.in);
	
	public Livro() {
		this.id += 1;
	}
	
	public static String solicitaDados() {
		System.out.println("Digite a string solicitada: ");
		return getSc().next();
	}
	
	public static Scanner getSc() {
		return sc;
	}

	public int getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(String anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
