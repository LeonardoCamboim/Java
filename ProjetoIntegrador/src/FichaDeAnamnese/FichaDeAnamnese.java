 package FichaDeAnamnese;

import java.util.Date; 

import Animais.Animal;
import Pessoas.Responsavel;
import Pessoas.Veterinario;

public class FichaDeAnamnese {
	
	
	private Date data;
	private Veterinario veterinario;
	private Responsavel responsavel;
	private Animal animal;
	private AnamneseGeral anamneseGeral;
	private AnamneseEspecial anamneseEspecial;
	private ExameFisico exameFisico;

	public FichaDeAnamnese(Date data, Veterinario veterinario, Responsavel responsavel, Animal animal,
			AnamneseGeral anamneseGeral, AnamneseEspecial anamneseEspecial, ExameFisico exameFisico) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.veterinario = veterinario;
		this.responsavel = responsavel;
		this.animal = animal;
		this.anamneseGeral = anamneseGeral;
		this.anamneseEspecial = anamneseEspecial;
		this.exameFisico = exameFisico;
	}
	
	public Date getDate() {
		return this.data;
	}

	public Veterinario getVeterinario() {
		return this.veterinario;
	}

	public Responsavel getResponsavel() {
		return this.responsavel;
	}

	public Animal getAnimal() {
		return this.animal;
	}

	public AnamneseGeral getAnamneseGeral() {
		return this.anamneseGeral;
	}
	
	public AnamneseEspecial getAnamneseEspecial() {
		return this.anamneseEspecial;
	}

	public ExameFisico getExameFisico() {
		return this.exameFisico;
	}
	
}
