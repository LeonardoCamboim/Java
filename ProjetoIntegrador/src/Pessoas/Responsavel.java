package Pessoas;

import java.util.ArrayList; 
import Animais.Animal;

public final class Responsavel extends Pessoa {
	
	private ArrayList<Animal> animalArrayList = new ArrayList();
	
	public Responsavel(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public ArrayList<Animal> getAnimalArrayList() {
		return animalArrayList;
	}
	 
	public void validaAnimal(Animal animal) {
	
		if (this.animalArrayList.contains(animal)) {
			throw new IllegalArgumentException("IllegalArgumentException: O animal ja foi incluido a lista."); 
		} else {
			this.animalArrayList.add(animal);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Responsavel: %s", super.toString());
	}

}
