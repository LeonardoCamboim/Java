package App;

import java.util.Scanner;

public interface Preenchimento {
	
	// Interfaces so aceitam campos/atributos constantes, 
	// são implicitamente public static final.
	Scanner sc = new Scanner(System.in);
	
	//Metodos de interface são implicitamente public abastract.
	void preencherCampos();
	
	//Metodos defoult não precisam ser sobrescritos.
	default String solicitaDados(String campos) {
		System.out.printf("Insira os dados solicitados do campo: %s%n", campos);
		return sc.nextLine();
	}

}
