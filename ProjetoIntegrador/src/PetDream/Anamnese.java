package PetDream;

public class Anamnese {
	
	private Responsavel responsavel;
	private Veterinario funcionario;
	private Animal animal;

	public Anamnese(Responsavel responsavel, Veterinario funcionario, Animal animal) {
		// TODO Auto-generated constructor stub
		this.responsavel = responsavel;
		this.funcionario = funcionario;
		this.animal = animal;		
	}
	
	public Responsavel getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}


	public Veterinario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Veterinario funcionario) {
		this.funcionario = funcionario;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
