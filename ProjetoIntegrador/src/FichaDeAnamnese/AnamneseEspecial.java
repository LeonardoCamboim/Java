package FichaDeAnamnese;

import Animais.Animal;

public class AnamneseEspecial extends Anamnese{
	
	private String sistemaRespiratorio;
	private String sistemaCardiovascular;
	private String sistemaDigestorio;
	private String sistemaUrinario;
	private String sistemaReprodutor;
	private String sistemaLocomotor;
	private String sistemaNeurologico;
	private String pelosEAnexos;
	private String olhos;
	
	public AnamneseEspecial(Animal animal) {  
		super(animal);
	}

	public String getSistemaRespiratorio() {
		return sistemaRespiratorio;
	}
	public void setSistemaRespiratorio(String sistemaRespiratorio) {
		this.sistemaRespiratorio = sistemaRespiratorio;
	}

	public String getSistemaCardiovascular() {
		return sistemaCardiovascular;
	}
	public void setSistemaCardiovascular(String sistemaCardiovascular) {
		this.sistemaCardiovascular = sistemaCardiovascular;
	}

	public String getSistemaDigestorio() {
		return sistemaDigestorio;
	}
	public void setSistemaDigestorio(String sistemaDigestorio) {
		this.sistemaDigestorio = sistemaDigestorio;
	}

	public String getSistemaUrinario() {
		return sistemaUrinario;
	}
	public void setSistemaUrinario(String sistemaUrinario) {
		this.sistemaUrinario = sistemaUrinario;
	}

	public String getSistemaReprodutor() {
		return sistemaReprodutor;
	}
	public void setSistemaReprodutor(String sistemaReprodutor) {
		this.sistemaReprodutor = sistemaReprodutor;
	}

	public String getSistemaLocomotor() {
		return sistemaLocomotor;
	}
	public void setSistemaLocomotor(String sistemaLocomotor) {
		this.sistemaLocomotor = sistemaLocomotor;
	}

	public String getSistemaNeurologico() {
		return sistemaNeurologico;
	}
	public void setSistemaNeurologico(String sistemaNeurologico) {
		this.sistemaNeurologico = sistemaNeurologico;
	}

	public String getPelosEAnexos() {
		return pelosEAnexos;
	}
	public void setPelosEAnexos(String pelosEAnexos) {
		this.pelosEAnexos = pelosEAnexos;
	}

	public String getOlhos() {
		return olhos;
	}
	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}

	@Override
	public void preencherCampos() {
		setSistemaRespiratorio(solicitaDados("Sistema respiratorio"));
		setSistemaCardiovascular(solicitaDados("Sistema cardiovascular"));
		setSistemaDigestorio(solicitaDados("Sistema digestorio"));
		setSistemaUrinario(solicitaDados("Sistema urinario"));
		setSistemaReprodutor(solicitaDados("Sistema reprodutor"));
		setSistemaLocomotor(solicitaDados("Sistema locomotor"));
		setSistemaNeurologico(solicitaDados("Sistema neurologico"));
		setPelosEAnexos(solicitaDados("Pelos e anexos"));
		setOlhos(solicitaDados("Olhos"));
	}
	@Override
	public String toString() {
		return String.format("%nAnamnese Especial: %n" 
				+ "Sistema respiratorio: %s%n"
				+ "Sistema cardio vascular: %s%n" 
				+ "Sistema urinario: %s%n"
				+ "Sistema reprodutor: %s%n"
				+ "Sistema locomotor: %s%n"
				+ "Sistema neurologico: %s%n"
				+ "pelos e anexos: %s%n"
				+ "Olhos: %s%n", getSistemaRespiratorio(), getSistemaCardiovascular(), 
				getSistemaUrinario(), getSistemaReprodutor(), getSistemaLocomotor(), 
				getSistemaNeurologico(), getPelosEAnexos(), getOlhos());
	}
}
