package App;

import java.util.ArrayList;

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

public class Funcionalidades {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formatter.parse("25/10/2022");
		
		Veterinario  veterinario01 = new Veterinario("Pedro", "11122233311", 5500.0);
		Responsavel responsavel01 = new Responsavel("Maria", "00000000011");
		
		Gato animal01 = new Gato(responsavel01, "Macho");		
		Cachorro animal02 = new Cachorro(responsavel01, "Femea");
		Passaro animal03 = new Passaro(responsavel01, "Macho");
		Peixe animal04 = new Peixe(responsavel01, "Femea");
		
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
		
		//Operador Condicional (?:) 
		//Operador ternário Java
		System.out.println(animal01 instanceof Gato ? 1 : "False");
		
		// Referenciação poliformica e o downcast
		// Equivalente ao for in
		for (Animal animal : responsavel01.getAnimal()) {
			
			// Comparação de instancias
			if (animal instanceof Gato) {
				
				// Downcast de referencia
				Gato gato = (Gato) animal;
				gato.metodoSubclass();
				
			}
		}
		
		// Iterando sobre arrays e listas e o metodo getClass()
		ArrayList<Animal> lista = responsavel01.getAnimal();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getClass().getSimpleName());
		}
		
		Animal[] list = new Animal[4];
		list[0] = animal01;
		list[1] = animal02;
		list[2] = animal03;
		list[3] = animal04;
		
		for (int i = 0; i < list.length; i++) {
			System.out.printf("O animal %d é um: %s%n", i, list[i].getClass().getSimpleName());
		}
		
		//Coersão: nos casos onde informações podem ser perdidas por causa de conversão o compilador
		//requer se utilize o operador de coersão (tipo), forçando explicitamente que a conversão ocorra
		//para responsabilização pela perda de informações. 
		int a = 25;
		double b = a;
		a = (int) b;
	
		
		/*
		AnamneseGeral anamneseGeral01 = new AnamneseGeral(responsavel01, veterinario01, animal01);
		AnamneseEspecial anamneseEspecial01 = new AnamneseEspecial(responsavel01, veterinario01, animal01);
		ExameFisico ExameFisico = new ExameFisico(veterinario01, animal01);
		FichaDeAnamnese fichaDeAnamnese01 = new FichaDeAnamnese(data, veterinario01, responsavel01, animal01, anamneseGeral01, anamneseEspecial01, ExameFisico);
	
		System.out.println(anamneseGeral01.getAnimal()); 
		*/
	}

}
