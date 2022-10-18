package Atividade11;

import java.util.Date;

public class Atendente extends Usuario {
	
	NivelSuporte nivelSuporte;

	public Atendente(String nome, String cpf, Date dataNascimento, String profissao, String email, NivelSuporte nivelSuporte) {
		super(nome, cpf, dataNascimento, profissao, email);
		this.nivelSuporte = nivelSuporte;
	}

}
