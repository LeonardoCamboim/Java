
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadeDePessoas = 2;
		boolean acompanhado = quantidadeDePessoas > 1;

		System.out.println("O valor de acompanhado é:" + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Voce é menor de idade, não pode entrar");
		}
	}
}
