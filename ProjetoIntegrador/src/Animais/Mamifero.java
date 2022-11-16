package Animais;

import Pessoas.Responsavel;

public abstract class Mamifero extends Animal {

	private String pelagem;
	
	public Mamifero(Responsavel responsavel) {
		super(responsavel);
		
	}
	
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

}
