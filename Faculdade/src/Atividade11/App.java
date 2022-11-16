package Atividade11;

import java.text.ParseException; 
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		NivelSuporte suporte = NivelSuporte.SUPORTE;
		StatusSuporte status = StatusSuporte.ABERTO;
		
		
		Cliente leo = new Cliente("Leonardo", "000.000.000-00", formato.parse("16/06/1997"), "Developer", "teste@gmail.com");
		Atendente rafinha = new Atendente("Rafaela", "000.000.000-00", formato.parse("27/01/1991"), "Developer", "teste@gmail.com", suporte);
		Chamado primeiro = new Chamado(1, formato.parse("18/10/2022"), status, leo, rafinha);
		
		leo.setCpf("Testando");
		
		
		
		System.out.println(leo.getCpf());
		
	}

}
