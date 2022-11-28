package App;

import java.util.ArrayList;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Animais.Peixe;
import Pessoas.Responsavel;
import Pessoas.Veterinario;

public class Estudos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veterinario  veterinario01 = new Veterinario("Joao da Silva", "11122233311", 5500.0);
		Responsavel responsavel01 = new Responsavel("Maria Helena", "02589625411");
		Responsavel responsavel02 = new Responsavel("Carlos Pereira", "57487624865");
		
		Gato     animal01 = new Gato("Bola de neve" , responsavel01, veterinario01, "Macho");		
		Cachorro animal02 = new Cachorro("Toto", responsavel01, veterinario01, "Femea");
		Passaro  animal03 = new Passaro("Louro", responsavel02, veterinario01, "Macho");
		Peixe    animal04 = new Peixe("Nemo", responsavel02, veterinario01, "Femea");
		
		//Operador Condicional (?:) ternário Java
		System.out.println(animal01 instanceof Gato ? 1 : "False");
				
		// Referenciação poliformica e o downcast
		// Equivalente ao for in
		for (Animal animal : responsavel01.getAnimalArrayList()) {
					
			// Comparação de instancias
			if (animal instanceof Gato) {
						
				// Downcast de referencia
				Gato gato = (Gato) animal;
				gato.metodoSubclass();
						
			}
		}
		
		/* Coersão: nos casos onde informações podem ser perdidas por causa de conversão o compilador
		requer que se utilize o operador de coersão (tipo), forçando explicitamente que a conversão ocorra
		para responsabilização pela perda de informações. */
		int a = 25;
		double b = a;
		a = (int) b;
		
		// Iterando sobre arrays e listas e o metodo getClass()
		ArrayList<Animal> lista = responsavel01.getAnimalArrayList();
				
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
	}

}
