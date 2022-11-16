package App;

import java.util.ArrayList;  
import java.util.Scanner;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Animais.Peixe;
import Endereco.Estado;
import Endereco.Pais;
import Pessoas.Responsavel;
import Pessoas.Veterinario;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formatter.parse("25/10/2022");
		
		
		Veterinario  veterinario01 = new Veterinario("Pedro", "000000000", 5500.0);
		Responsavel responsavel01 = new Responsavel("Maria", "000000000");
		
		Gato animal01 = new Gato(responsavel01);
		Cachorro animal02 = new Cachorro(responsavel01);
		Passaro animal03 = new Passaro(responsavel01);
		Peixe animal04 = new Peixe(responsavel01);
		
		responsavel01.addAnimal(animal01);
		responsavel01.addAnimal(animal02);
		responsavel01.addAnimal(animal03);
		responsavel01.addAnimal(animal04);
		
		System.out.print(responsavel01.getAnimal());
		System.out.println();
		
		Estado paraiba = new Estado("Paraiba");
		Estado rioDeJaneiro = new Estado("Rio de Janeiro");
		
		System.out.println();
		System.out.println(Pais.getEstados());
		
		
		/*
		AnamneseGeral anamneseGeral01 = new AnamneseGeral(responsavel01, veterinario01, animal01);
		AnamneseEspecial anamneseEspecial01 = new AnamneseEspecial(responsavel01, veterinario01, animal01);
		ExameFisico ExameFisico = new ExameFisico(veterinario01, animal01);
		FichaDeAnamnese fichaDeAnamnese01 = new FichaDeAnamnese(data, veterinario01, responsavel01, animal01, anamneseGeral01, anamneseEspecial01, ExameFisico);
	
		System.out.println(anamneseGeral01.getAnimal()); 
		*/
	}

}
