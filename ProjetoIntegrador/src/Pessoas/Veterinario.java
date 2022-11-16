package Pessoas;

public class Veterinario extends Pessoa {
	
	private static int controleMatricula = 100000;
	private int matricula = controleMatricula;
	private Double salario;

		public Veterinario(String nome, String cpf, Double salario) {
		// TODO Auto-generated constructor stub
		super(nome, cpf);
		this.salario = salario;
		Veterinario.controleMatricula++;
	}
		
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public int getControleMatricula() {
		return controleMatricula;
	}

}
