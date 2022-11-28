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
	
	public FichaDeAnamnese(Animal animalPaciente, String data) throws ParseException {
		this.animalPaciente = animalPaciente;
		this.data = formatter.parse(data);
		this.anamneseGeral = new AnamneseGeral(animalPaciente);
		this.anamneseEspecial = new AnamneseEspecial(animalPaciente);
		this.exameFisico = new ExameFisico(animalPaciente);
		total++;
	}
	
	@Override
	public void preencherCampos() {
		this.anamneseGeral.preencherCampos();
		this.anamneseEspecial.preencherCampos();
		this.exameFisico.preencherCampos();
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
