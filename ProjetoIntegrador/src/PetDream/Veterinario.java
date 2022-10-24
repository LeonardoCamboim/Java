package PetDream;

public class Veterinario extends Pessoa {
	
	private int matricula;
	private Double salario;

	public Veterinario(String nome, String cpf, String endereço, String cidade, String estado, String telefoneFixo, String celular, int matricula, Double salario) {
		// TODO Auto-generated constructor stub
		super(nome, cpf, endereço, cidade, estado, telefoneFixo, celular);
		this.matricula = matricula;
		this.salario = salario;
	}

}
