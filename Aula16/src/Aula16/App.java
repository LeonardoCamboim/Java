package Aula16;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Livro livro01 = new Livro();
		livro01.setTitulo(Livro.solicitaDados());
		livro01.setAutor(Livro.solicitaDados());
		livro01.setAnoDePublicacao(Livro.solicitaDados());	
		livro01.setEditora(Livro.solicitaDados());
		
		Livro livro02 = new Livro();
		livro02.setTitulo(Livro.solicitaDados());
		livro02.setAutor(Livro.solicitaDados());
		livro02.setAnoDePublicacao(Livro.solicitaDados());	
		livro02.setEditora(Livro.solicitaDados());
		
		Livro livro03 = new Livro();
		livro03.setTitulo(Livro.solicitaDados());
		livro03.setAutor(Livro.solicitaDados());
		livro03.setAnoDePublicacao(Livro.solicitaDados());	
		livro03.setEditora(Livro.solicitaDados());
		
		Livro livro04 = new Livro();
		livro04.setTitulo(Livro.solicitaDados());
		livro04.setAutor(Livro.solicitaDados());
		livro04.setAnoDePublicacao(Livro.solicitaDados());	
		livro04.setEditora(Livro.solicitaDados());
		
		Livro livro05 = new Livro();
		livro05.setTitulo(Livro.solicitaDados());
		livro05.setAutor(Livro.solicitaDados());
		livro05.setAnoDePublicacao(Livro.solicitaDados());	
		livro05.setEditora(Livro.solicitaDados());
		
		System.out.println(livro01.getId());
		System.out.println(livro01.getTitulo());
		System.out.println(livro01.getAutor());
		System.out.println(livro01.getAnoDePublicacao());
		System.out.println(livro01.getEditora());

	}

}
