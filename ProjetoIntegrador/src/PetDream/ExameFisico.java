package PetDream;

import java.util.Scanner;

public class ExameFisico {
	
	private String postura;
	private String nivelDeConsciencia;
	private String escoreCorporal;
	private int tr;
	private String fr;
	private String fc;
	private String tpc;
	private String pulso;
	private String hidratacao;
	private String linfonodosSubmand;
	private String linfPreEscapulares;
	private String linfPopliteos;
	private String linfInguinais;
	private String mucosaOcular;
	private String mucosaOral;
	private String mucosaPeniana;
	private String mucosaAnal;
	private Animal animal;
	private Veterinario veterinario;

	public ExameFisico(Veterinario veterinario, Animal animal) {
		// TODO Auto-generated constructor stub
		this.veterinario = veterinario;
		this.animal = animal;
		this.preencherExameFisico();
	}
	
	public void preencherExameFisico() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Postura: ");
		this.postura = scanner.toString();
		
		System.out.println("Nivel De Consciencia: ");
		this.nivelDeConsciencia = scanner.toString();
		
		System.out.println("Escore Corporal: ");
		this.escoreCorporal = scanner.toString();
		
		System.out.println("Tr: ");
		this.tr = scanner.nextInt();
		
		System.out.println("Fr: ");
		this.fr = scanner.toString();
		
		System.out.println("Fc: ");
		this.fc = scanner.toString();
		
		System.out.println("Tpc: ");
		this.tpc = scanner.toString();
		
		System.out.println("Pulso: ");
		this.pulso = scanner.toString();
		
		System.out.println("Hidratacao: ");
		this.hidratacao = scanner.toString();
		
		System.out.println("Linfonodos Submand: ");
		this.linfonodosSubmand = scanner.toString();
		
		System.out.println("linf Pre Escapulares: ");
		this.linfPreEscapulares = scanner.toString();
		
		System.out.println("linf Popliteos: ");
		this.linfPopliteos = scanner.toString();
		
		System.out.println("linf Inguinais: ");
		this.linfInguinais = scanner.toString();
		
		System.out.println("Mucosa Ocular: ");
		this.mucosaOcular = scanner.toString();
		
		System.out.println("Mucosa Oral: ");
		this.mucosaOral = scanner.toString();
		
		System.out.println("Mucosa Peniana: ");
		this.mucosaPeniana = scanner.toString();
		
		System.out.println("Mucosa Anal: ");
		this.mucosaAnal = scanner.toString();
		
		scanner.close();
	}
	
	public String getPostura() {
		return postura;
	}

	public void setPostura(String postura) {
		this.postura = postura;
	}

	public String getNivelDeConsciencia() {
		return nivelDeConsciencia;
	}

	public void setNivelDeConsciencia(String nivelDeConsciencia) {
		this.nivelDeConsciencia = nivelDeConsciencia;
	}

	public String getEscoreCorporal() {
		return escoreCorporal;
	}

	public void setEscoreCorporal(String escoreCorporal) {
		this.escoreCorporal = escoreCorporal;
	}

	public int getTr() {
		return tr;
	}

	public void setTr(int tr) {
		this.tr = tr;
	}

	public String getFr() {
		return fr;
	}

	public void setFr(String fr) {
		this.fr = fr;
	}

	public String getFc() {
		return fc;
	}

	public void setFc(String fc) {
		this.fc = fc;
	}

	public String getTpc() {
		return tpc;
	}

	public void setTpc(String tpc) {
		this.tpc = tpc;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getHidratacao() {
		return hidratacao;
	}

	public void setHidratacao(String hidratacao) {
		this.hidratacao = hidratacao;
	}

	public String getLinfonodosSubmand() {
		return linfonodosSubmand;
	}

	public void setLinfonodosSubmand(String linfonodosSubmand) {
		this.linfonodosSubmand = linfonodosSubmand;
	}

	public String getLinfPreEscapulares() {
		return linfPreEscapulares;
	}

	public void setLinfPreEscapulares(String linfPreEscapulares) {
		this.linfPreEscapulares = linfPreEscapulares;
	}

	public String getLinfPopliteos() {
		return linfPopliteos;
	}

	public void setLinfPopliteos(String linfPopliteos) {
		this.linfPopliteos = linfPopliteos;
	}

	public String getLinfInguinais() {
		return linfInguinais;
	}

	public void setLinfInguinais(String linfInguinais) {
		this.linfInguinais = linfInguinais;
	}

	public String getMucosaOcular() {
		return mucosaOcular;
	}

	public void setMucosaOcular(String mucosaOcular) {
		this.mucosaOcular = mucosaOcular;
	}

	public String getMucosaOral() {
		return mucosaOral;
	}

	public void setMucosaOral(String mucosaOral) {
		this.mucosaOral = mucosaOral;
	}

	public String getMucosaPeniana() {
		return mucosaPeniana;
	}

	public void setMucosaPeniana(String mucosaPeniana) {
		this.mucosaPeniana = mucosaPeniana;
	}

	public String getMucosaAnal() {
		return mucosaAnal;
	}

	public void setMucosaAnal(String mucosaAnal) {
		this.mucosaAnal = mucosaAnal;
	}

}
