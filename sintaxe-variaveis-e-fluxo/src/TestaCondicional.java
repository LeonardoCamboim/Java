
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 16;
		int quantidadeDePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Sua idade � maior do que 18 anos");
			System.out.println("Seja bem vindo!");
		} else {
			
			if (quantidadeDePessoas >= 2) {
				System.out.println("Voce � menor de idade mas pode entrar porque esta acompanhado");
			} else {
				System.out.println("Voce � menor de idade, n�o pode entrar");
			}
		}
		TestaClass conta01 = new TestaClass();
		conta01.saldo += 100;
		System.out.println(conta01.saldo);
	}
}
