package CadastroListagemProdutos;

import java.util.Collections;

import CadastroListagemProdutos.Listagem;

public class Produto implements Comparable<Produto> {
	
	private String nome;
	private String descricaoProduto;
	private double valor;
	private boolean disponivelParaVenda;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		Listagem.addListaProdutos(this);
		Listagem.ordenaLista();
		System.out.println(Listagem.getListaProdutos());
	}
	
	public Produto(String nome, double valor, String descricaoProduto, boolean disponivelParaVenda) {
		this.nome = nome;
		this.valor = valor;
		this.descricaoProduto = descricaoProduto;
		this.disponivelParaVenda = disponivelParaVenda;
		Listagem.addListaProdutos(this);
		System.out.println(Listagem.getListaProdutos());
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean getDisponivelParaVenda() {
		return disponivelParaVenda;
	}
	public void setDisponivelParaVenda(boolean disponivelParaVenda) {
		this.disponivelParaVenda = disponivelParaVenda;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return String.format(" [ Nome: %s - Valor: %s ] %n", getNome(), getValor());
	}

	@Override
	public int compareTo(Produto produto) {
		if(this.valor > produto.getValor()) {
			return 1;
		} else if (this.valor < produto.getValor()) {
			return -1;
		} else {
			return this.getNome().compareToIgnoreCase(produto.getNome());
		}
	}
}
