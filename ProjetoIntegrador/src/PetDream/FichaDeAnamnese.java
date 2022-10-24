 package PetDream;

import java.util.Date;

public class FichaDeAnamnese {
	
	
	private Date data;
	private Veterinario veterinario;
	private Responsavel responsavel;
	private Animal animal;
	private AnamneseGeral anamneseGeral;
	private AnamneseEspecial anamneseEspecial;
	private ExameFisico exameFisico;

	public FichaDeAnamnese(Date data, Veterinario veterinario, Responsavel responsavel, Animal animal, AnamneseGeral anamneseGeral, AnamneseEspecial anamneseEspecial, ExameFisico exameFisico) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.veterinario = veterinario;
		this.responsavel = responsavel;
		this.animal = animal;
		this.anamneseGeral = anamneseGeral;
		this.anamneseEspecial = anamneseEspecial;
		this.exameFisico = exameFisico;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public AnamneseGeral getAnamneseGeral() {
		return anamneseGeral;
	}

	public void setAnamneseGeral(AnamneseGeral anamneseGeral) {
		this.anamneseGeral = anamneseGeral;
	}

	public AnamneseEspecial getAnamneseEspecial() {
		return anamneseEspecial;
	}

	public void setAnamneseEspecial(AnamneseEspecial anamneseEspecial) {
		this.anamneseEspecial = anamneseEspecial;
	}

	public ExameFisico getExameFisico() {
		return exameFisico;
	}

	public void setExameFisico(ExameFisico exameFisico) {
		this.exameFisico = exameFisico;
	}
	
}
