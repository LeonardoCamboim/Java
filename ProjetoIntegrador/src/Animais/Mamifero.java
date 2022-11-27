package Animais;

import Pessoas.Responsavel;

public abstract class Mamifero extends Animal {

	private String pelagem;
	
	public Mamifero(Responsavel responsavel, String sexo) {
		super(responsavel, sexo);
		
	}
	
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
}
