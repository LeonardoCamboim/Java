package PetDream;

import java.util.Scanner;

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

	public AnamneseEspecial(Responsavel responsavel, Veterinario funcionario, Animal animal) {
		// TODO Auto-generated constructor stub
		super(responsavel, funcionario, animal);
		this.preencherAnamneseEspecial();
		
	}
	
	public void preencherAnamneseEspecial() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sistema Respiratorio: ");
		this.sistemaRespiratorio = scanner.toString();
		
		System.out.println("Sistema Cardiovascular: ");
		this.sistemaCardiovascular = scanner.toString();
		
		System.out.println("Sistema Digestorio: ");
		this.sistemaDigestorio = scanner.toString();
		
		System.out.println("Sistema Urinario: ");
		this.sistemaUrinario = scanner.toString();
		
		System.out.println("Sistema Reprodutor: ");
		this.sistemaReprodutor = scanner.toString();
		
		System.out.println("Sistema Locomotor: ");
		this.sistemaLocomotor = scanner.toString();
		
		System.out.println("Sistema Neurologico: ");
		this.sistemaNeurologico = scanner.toString();
		
		System.out.println("Pelos e Anexos: ");
		this.pelosEAnexos = scanner.toString();
		
		System.out.println("Olhos: ");
		this.olhos = scanner.toString();
	
		scanner.close();
		
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

}
