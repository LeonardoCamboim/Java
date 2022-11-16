package FichaDeAnamnese;

import java.util.ArrayList;

import Animais.Animal; 
import Pessoas.Responsavel;
import Pessoas.Veterinario;

public abstract class Anamnese {
	
	private Responsavel responsavel;
	private Veterinario veterinario;
	private Animal animal;
	
	public Anamnese(Responsavel r, Veterinario v, Animal a) {
		// TODO Auto-generated constructor stub
		this.responsavel = r;
		this.veterinario = v;
		this.animal = a;
	}
	
	public Anamnese() {

	}
	
	public Responsavel getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}


	public Veterinario getVeterinario() {
		return veterinario;
	}


	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do responsavel: %s%n Nome do Veterinario: %s%n Nome e raça do animal: %s%n", getResponsavel(),getVeterinario(),getAnimal());
	}
	
}
