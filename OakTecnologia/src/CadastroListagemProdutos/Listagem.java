package CadastroListagemProdutos;

import java.util.ArrayList;
import java.util.Collections;

public class Listagem {
	
	private static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	public Listagem() {

	}

	public static ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public static void addListaProdutos(Produto produto) {
		Listagem.listaProdutos.add(produto);
	}
	
	public static Produto criaProduto(String nome, double valor) {
		Produto novoProduto = new Produto(nome, valor);
		return novoProduto;
	}
	
	public static void ordenaLista() {
		Collections.sort(listaProdutos);
	}
	
	@Override
	public String toString() {
		return String.format("%s", getListaProdutos());
	}
	
}
