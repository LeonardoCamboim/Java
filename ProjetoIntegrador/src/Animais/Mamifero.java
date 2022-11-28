package Animais;

import Pessoas.Responsavel;
import Pessoas.Veterinario;

public abstract class Mamifero extends Animal {

	private String pelagem;
	
	public Mamifero(Responsavel responsavel, Veterinario veterinario, String sexo) {
		super(responsavel, veterinario, sexo);
		
	}
	public Mamifero(String nome ,Responsavel responsavel, Veterinario veterinario, String sexo) {
		super(nome, responsavel, veterinario, sexo);
		
	}
	
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
}
