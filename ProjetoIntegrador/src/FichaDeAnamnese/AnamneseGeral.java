package FichaDeAnamnese;
 
import Animais.Animal;

public class AnamneseGeral extends Anamnese {
	
	private String queixaPrincipal;
	private String historicoMedicoPregresso;
	private String alimentacao;
	private String contactantes;
	private String ambienteEmQueVive;
	private String vacinacao;
	private String vermifugacao;

	public AnamneseGeral(Animal animal) { 
		super(animal);
	}
	
	public String getQueixaPrincipal() {
		return queixaPrincipal;
	}
	public void setQueixaPrincipal(String queixaPrincipal) {
		this.queixaPrincipal = queixaPrincipal;
	}

	public String getHistoricoMedicoPregresso() {
		return historicoMedicoPregresso;
	}
	public void setHistoricoMedicoPregresso(String historicoMedicoPregresso) {
		this.historicoMedicoPregresso = historicoMedicoPregresso;
	}

	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getContactantes() {
		return contactantes;
	}
	public void setContactantes(String contactantes) {
		this.contactantes = contactantes;
	}

	public String getAmbienteEmQueVive() {
		return ambienteEmQueVive;
	}
	public void setAmbienteEmQueVive(String ambienteEmQueVive) {
		this.ambienteEmQueVive = ambienteEmQueVive;
	}

	public String getVacinacao() {
		return vacinacao;
	}
	public void setVacinacao(String vacinacao) {
		this.vacinacao = vacinacao;
	}

	public String getVermifugacao() {
		return vermifugacao;
	}
	public void setVermifugacao(String vermifugacao) {
		this.vermifugacao = vermifugacao;
	}

	@Override
	public void preencherCampos() {
		setQueixaPrincipal(solicitaDados("Queixa principal"));
		setHistoricoMedicoPregresso(solicitaDados("Historico medico pregresso"));
		setAlimentacao(solicitaDados("Alimentação"));
		setContactantes(solicitaDados("Contactantes"));
		setAmbienteEmQueVive(solicitaDados("Ambiente em que vive"));
		setVacinacao(solicitaDados("Vacinação"));
		setVermifugacao(solicitaDados("Vermifugação"));
	}
	
	@Override
	public String toString() {
		return String.format("%nAnamnese Geral: %n" 
				+ "Queixa principal: %s%n"
				+ "Historico medico pregresso: %s%n" 
				+ "Alimentação: %s%n"
				+ "Contectantes: %s%n"
				+ "Ambiente em que vive: %s%n"
				+ "Vacinação: %s%n"
				+ "Vermifugação: %s%n", getQueixaPrincipal(), getHistoricoMedicoPregresso(), 
				getAlimentacao(), getContactantes(), getAmbienteEmQueVive(),
				getVacinacao(), getVermifugacao());
	}
}
