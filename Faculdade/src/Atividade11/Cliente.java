package Atividade11;

import java.io.PrintStream;
import java.util.Date;

public class Cliente extends Usuario{
	
	public Cliente(String nome, String cpf, Date dataNascimento, String profissao, String email) {
		super(nome, cpf, dataNascimento, profissao, email);
		
	}
	
	@Override
	public String getCpf() {
		return String.format("%s %s %s", "Cliente", super.getNome() , super.getCpf());
	}
	
	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}
	
}
