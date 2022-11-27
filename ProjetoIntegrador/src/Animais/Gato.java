package Animais;

import App.TesteInterface; 
import Pessoas.Responsavel;

public final class Gato extends Mamifero implements TesteInterface{
	
	public Gato(Responsavel responsavel, String sexo) {
		super(responsavel, sexo);
	}
	
	public void metodoSubclass() {
		System.out.println("Metodo subclasse");
	}
	
	@Override
	public String toString() {
		return String.format("%s - especie = %s] %n", super.toString(), this.getClass().getSimpleName());
	}
	
}
