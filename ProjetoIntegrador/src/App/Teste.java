package App;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Pessoas.Responsavel;

public class Teste {

	public static void main(String[] args) {
		
		
		String[] a = args; 
		System.out.println(a);
		
		Responsavel variavelReferencia = new Responsavel("Leonardo", "09061333431");
		
		System.out.println(variavelReferencia.getClass());
		variavelReferencia.setNome("Leonardo");
		System.out.println(variavelReferencia.getNome());
		System.out.println(variavelReferencia.getCpf());
		
		Gato animal01 = new Gato(variavelReferencia);
		Cachorro animal02 = new Cachorro(variavelReferencia);
		
		
		System.out.println(variavelReferencia.addAnimal(animal01));
		System.out.println(variavelReferencia.addAnimal(animal02));
		
		
		System.out.println(variavelReferencia.getAnimal());
		System.out.println(variavelReferencia.getCidade());
		
	}
}
