package FichaDeAnamnese;

import Animais.Animal;  
import App.Preenchimento;

public abstract class Anamnese extends Object implements Preenchimento {
	
	private Animal animalPaciente;
	
	public Anamnese(Animal animalPaciente) { 
		this.animalPaciente = animalPaciente;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
