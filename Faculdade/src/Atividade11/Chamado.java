package Atividade11;

import java.util.Date;

public class Chamado {
	int id;
	Date dataAbertura;
	StatusSuporte statusSuporte;
	Cliente cliente;
	Atendente atendente;
	

	public Chamado(int id, Date dataAbertura, StatusSuporte statusSuporte, Cliente cliente, Atendente atendente) {
		this.id = id;
		this.dataAbertura = dataAbertura;
		this.statusSuporte = statusSuporte;
		this.cliente = cliente;
		this.atendente = atendente;
	}
	
}
