package PetDream;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formatter.parse("25/10/2022");
		
		
		Veterinario  veterinario01 = new Veterinario("Pedro", "000.000.000.00", "Rua. Figueira lima", "João Pessoa", "Paraiba", "(83)99999-9999", "(83)99999-9999", 2521, 5525.50);
		Responsavel responsavel01 = new Responsavel("Maria", "000.000.000.00", "Rua. Nova esperança", "João Pessoa", "Paraiba", "(83)99999-9999", "(83)99999-9999");
		Animal animal01 = new Animal(responsavel01);
		responsavel01.addAnimal(animal01);
		System.out.print(responsavel01.getAnimal());
		AnamneseGeral anamneseGeral01 = new AnamneseGeral(responsavel01, veterinario01, animal01);
		AnamneseEspecial anamneseEspecial01 = new AnamneseEspecial(responsavel01, veterinario01, animal01);
		ExameFisico ExameFisico = new ExameFisico(veterinario01, animal01);
		FichaDeAnamnese fichaDeAnamnese01 = new FichaDeAnamnese(data, veterinario01, responsavel01, animal01, anamneseGeral01, anamneseEspecial01, ExameFisico);

	}

}
