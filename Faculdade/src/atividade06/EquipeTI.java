package atividade06;

public class EquipeTI {
	
	// Questão 01
	
	private int id;
	
	private String nome;
	private String email;
	private Double salario;

	public EquipeTI(int id,String nome,String email,Double salario) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	public void aumentarSalario(Double porcentagem) {
		this.salario += (this.salario * (porcentagem / 100));
		
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	// Questao 02
	
	public Double calculaImposto() {
		
		Double inss;
		
		if (this.salario < 1212) {
			inss = this.salario * 0.075;
		} else if (this.salario >= 1212.01 || this.salario <= 2427.35){
			inss = this.salario * 0.090;
		} else if (this.salario >= 2427.36 || this.salario <= 3641.03){
			inss = this.salario * 0.012;
		} else {
			inss = this.salario * 0.014;
		}
		return inss;
		
	}
	
}
