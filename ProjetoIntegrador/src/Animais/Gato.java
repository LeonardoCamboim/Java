package Animais;

import Pessoas.Responsavel;
import Pessoas.Veterinario;

public final class Gato extends Mamifero {
	
	public Gato(Responsavel responsavel, Veterinario veterinario, String sexo) {
		super(responsavel, veterinario, sexo);
	}
	
	public Gato(String nome, Responsavel responsavel, Veterinario veterinario, String sexo) {
		super(nome, responsavel, veterinario, sexo);
	}
	
	public void metodoSubclass() {
		System.out.println("Metodo subclasse");
	}
	
	@Override
	public String toString() {
		return String.format("%s %n Especie: %s %n", super.toString(), this.getClass().getSimpleName());
	}
	
}
