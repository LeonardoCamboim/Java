package FichaDeAnamnese;

import java.util.Scanner;   
import Animais.Animal;
import Pessoas.Responsavel;
import Pessoas.Veterinario;

public class AnamneseGeral extends Anamnese {
	
	private String queixaPrincipal;
	private String historicoMedicoPregresso;
	private String alimentacao;
	private String contactantes;
	private String ambienteEmQueVive;
	private String vacinacao;
	private String vermifugacao;

	public AnamneseGeral(Responsavel responsavel, Veterinario funcionario, Animal animal) {
		// TODO Auto-generated constructor stub
		super(responsavel, funcionario, animal);
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
	
}
