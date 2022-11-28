package Pessoas;

public final class Veterinario extends Pessoa {
	
	private Double salario;

		public Veterinario(String nome, String cpf, Double salario) {
		super(nome, cpf);
		this.salario = salario;
	}
		
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return String.format("Veterinario: %s", super.toString());
	}
}
