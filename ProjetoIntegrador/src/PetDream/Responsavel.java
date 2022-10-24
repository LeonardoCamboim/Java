package PetDream;

import java.util.ArrayList;
import java.util.List;

public class Responsavel extends Pessoa {
	
	private ArrayList<Animal> animal = new ArrayList();

	public Responsavel(String nome, String cpf, String endereço, String cidade, String estado, String telefoneFixo, String celular) {
		// TODO Auto-generated constructor stub
		super(nome, cpf, endereço, cidade, estado, telefoneFixo, celular);
		
	}
	
	public ArrayList<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal.add(animal);
	}
	
}
