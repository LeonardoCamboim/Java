package Animais;

import Pessoas.Responsavel;  
import Pessoas.Veterinario;

public final class Cachorro extends Mamifero {

	public Cachorro(Responsavel responsavel, Veterinario veterinario, String sexo) {
		super(responsavel, veterinario, sexo);
	}
	
	public Cachorro(String nome, Responsavel responsavel, Veterinario veterinario, String sexo) {
		super(nome, responsavel, veterinario, sexo);
	}
	
	@Override
	public String toString() {
		return String.format("%s %n Especie: %s %n", super.toString(), this.getClass().getSimpleName());
	}
}
