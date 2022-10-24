package PetDream;

import java.util.ArrayList;
import java.util.List;

public class Responsavel extends Pessoa {
	
	private Animal animal;

	

	public Responsavel(String nome, String cpf, String endereço, String cidade, String estado, int telefoneFixo, int celular, Animal animal) {
		// TODO Auto-generated constructor stub
		super(nome, cpf, endereço, cidade, estado, telefoneFixo, celular);
		this.animal = animal;
		
	}
	
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	

}
