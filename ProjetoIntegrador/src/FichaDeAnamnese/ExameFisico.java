package FichaDeAnamnese;

import Animais.Animal; 

public class ExameFisico extends Anamnese {
	
	private String postura;
	private String nivelDeConsciencia;
	private String escoreCorporal;
	private String tr;
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

	public ExameFisico(Animal animalPaciente) { 
		super(animalPaciente);
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

	public String getTr() {
		return tr;
	}
	public void setTr(String tr) {
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

	@Override
	public void preencherCampos() {
		setPostura(solicitaDados("Postura"));
		setNivelDeConsciencia(solicitaDados("Nivel de consciencia"));
		setEscoreCorporal(solicitaDados("Escore corporal"));
		setTr(solicitaDados("Tr"));
		setFr(solicitaDados("Fr"));
		setFc(solicitaDados("Fc"));
		setTpc(solicitaDados("Tpc"));
		setPulso(solicitaDados("Pulso"));
		setHidratacao(solicitaDados("Hidratação"));
		setLinfonodosSubmand(solicitaDados("Linfonodos submand"));
		setLinfPreEscapulares(solicitaDados("Linf. preescapulares"));
		setLinfPopliteos(solicitaDados("Linf. popliteos"));
		setLinfInguinais(solicitaDados("Linf. inguinais"));
		setMucosaOcular(solicitaDados("Mucosa ocular"));
		setMucosaOral(solicitaDados("Mucosa oral"));
		setMucosaPeniana(solicitaDados("Mucosa peniana"));
		setMucosaAnal(solicitaDados("Mucosa anal"));
	}
	
	@Override
	public String toString() {
		return String.format("%nExame fisico: %n"
				+ "Postura: %s%n"
				+ "Nivel de consciencia: %s%n"
				+ "Escore corporal: %s%n"
				+ "Tr: %s%n"
				+ "Fr: %s%n"
				+ "Fc: %s%n"
				+ "Tpc: %s%n"
				+ "Pulso: %s%n"
				+ "Hidratacao: %s%n"
				+ "Linfonodos submand: %s%n"
				+ "Linf. pre. escapulares: %s%n"
				+ "Linf. popliteos: %s%n"
				+ "Linf. inguinais: %s%n"
				+ "Mucosa ocular: %s%n"
				+ "Mucosa oral: %s%n"
				+ "Mucosa peniana: %s%n"
				+ "Mucosa anal: %s%n", getPostura(), getNivelDeConsciencia(),
				getEscoreCorporal(), getTr(), getFr(), getFc(), getTpc(),
				getPulso(), getHidratacao(), getLinfonodosSubmand(),
				getLinfPreEscapulares(), getLinfPopliteos(), getLinfInguinais(),
				getMucosaOcular(), getMucosaOral(), getMucosaPeniana(), getMucosaAnal());
	}
}
