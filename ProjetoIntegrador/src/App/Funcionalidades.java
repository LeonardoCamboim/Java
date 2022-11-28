package App;

import Animais.Cachorro; 
import Animais.Gato;
import Animais.Passaro;
import Animais.Peixe;
import FichaDeAnamnese.FichaDeAnamnese;
import Pessoas.Responsavel;
import Pessoas.Veterinario;

import java.text.ParseException;

public class Funcionalidades {

	public static void main(String[] args) throws ParseException {
		
		Veterinario  veterinario01 = new Veterinario("Joao da Silva", "11122233311", 5500.0);
		Responsavel responsavel01 = new Responsavel("Maria Helena", "02589625411");
		Responsavel responsavel02 = new Responsavel("Carlos Pereira", "57487624865");
		
		Gato     animal01 = new Gato("Bola de neve" , responsavel01, veterinario01, "Macho");		
		Cachorro animal02 = new Cachorro("Toto", responsavel01, veterinario01, "Femea");
		Passaro  animal03 = new Passaro("Louro", responsavel02, veterinario01, "Macho");
		Peixe    animal04 = new Peixe("Nemo", responsavel02, veterinario01, "Femea");

		FichaDeAnamnese fichaDeAnamnese01 = new FichaDeAnamnese(animal01, "27/11/2022");
		
		fichaDeAnamnese01.preencherCampos();
		
		System.out.println(fichaDeAnamnese01);
		
	}

}
