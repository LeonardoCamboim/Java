package Animais;

import Pessoas.Responsavel;

public final class Passaro extends Animal {

	public Passaro(Responsavel responsavel, String sexo) {
		super(responsavel, sexo);
	}
	
	@Override
	public String toString() {
		return String.format("%s - especie = %s] %n", super.toString(), this.getClass().getSimpleName());
	}
}
