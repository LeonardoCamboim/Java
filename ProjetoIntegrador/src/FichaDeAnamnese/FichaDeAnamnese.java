 package FichaDeAnamnese;

import java.text.ParseException;  
import java.text.SimpleDateFormat;
import java.util.Date; 
import Animais.Animal;
import App.Preenchimento;

public final class FichaDeAnamnese extends Object implements Preenchimento {
	
	private int              numero = total;
	private Date             data;
	private Animal           animalPaciente;
	private AnamneseGeral    anamneseGeral;
	private AnamneseEspecial anamneseEspecial;
	private ExameFisico      exameFisico;
	private static int       total;
	private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	private Preenchimento[] compartimentos = new Preenchimento[4];
	
	public FichaDeAnamnese(Animal animalPaciente, String data) throws ParseException {
		this.animalPaciente = animalPaciente;
		this.data = formatter.parse(data);
		this.anamneseGeral = new AnamneseGeral(animalPaciente);
		this.anamneseEspecial = new AnamneseEspecial(animalPaciente);
		this.exameFisico = new ExameFisico(animalPaciente);
		preencherCompartimentos();
		total++;
	}

	//Metodo auxiliar do construtor para composição da lista de componentes.
	private void preencherCompartimentos() {
		this.compartimentos[0] = this.animalPaciente;
		this.compartimentos[1] = this.anamneseGeral;
		this.compartimentos[2] = this.anamneseEspecial;
		this.compartimentos[3] = this.exameFisico;
	}
	
	@Override
	public void preencherCampos() {	
		for (Preenchimento i : this.compartimentos) {
			System.out.println("Preenchimento de informações: " + i.getClass().getSimpleName());
			i.preencherCampos();
		}
	}

	public Animal getAnimalPaciente() {
		return animalPaciente;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public static int getTotal() {
		return total;
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
	
	@Override
	public String toString() {
		return String.format(" Ficha de Anamnese Numero: %d%n Data: %s%n"
				+ "%s"
				+ "%s"
				+ "%s"
				+ "%s", getNumero(), getData(), getAnimalPaciente(),
				getAnamneseGeral(), getAnamneseEspecial(), getExameFisico());
	}

}
