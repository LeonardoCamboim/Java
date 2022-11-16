package Pessoas;

import java.util.ArrayList;  
import java.util.List;

import Animais.Animal;

public class Responsavel extends Pessoa {
	
	private ArrayList<Animal> animal = new ArrayList();
	private int indexArrayDoAnimal;

	public Responsavel(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		super(nome, cpf);
	}
	
	public ArrayList<Animal> getAnimal() {
		return animal;
	}

	public boolean addAnimal(Animal animal) {
	
		if (this.animal.contains(animal)) {
			return false;
		} else {
			this.animal.add(animal);
			animal.setIndexArrayDoResponsavel(indexArrayDoAnimal);
			indexArrayDoAnimal++;
			return true;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Responsavel: %s", super.toString());
	}

}
