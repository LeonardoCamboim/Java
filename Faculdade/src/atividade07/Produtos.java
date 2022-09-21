package atividade07;

public class Produtos {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public Produtos(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public double verificaValorTotalEstoque() {
		
		double valorTotalEstoque = preco * quantidade;
		return valorTotalEstoque;
		
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
