package Animais;

import Pessoas.Responsavel;  
import Pessoas.Veterinario;

public final class Roedores extends Animal {

	public Roedores(Responsavel responsavel, Veterinario veterinario, String sexo) {
		super(responsavel, veterinario, sexo);
	}

	public Roedores(String nome, Responsavel responsavel, Veterinario veterinario, String sexo) {
		super(nome, responsavel, veterinario, sexo);
	}
	
	@Override
	public String toString() {
		return String.format("%s %n Especie: %s %n", super.toString(), this.getClass().getSimpleName());
	}
}
