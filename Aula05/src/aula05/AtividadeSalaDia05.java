// Grupo: Leonardo de Almeida Camboim, André felipe Santos Alexandre, Guilherme Monteiro Dias Filho

package aula05;
import java.util.Scanner;

public class AtividadeSalaDia05 {
	

	private int sum;
	private int count;
	Scanner scanner = new Scanner(System.in);
	
	public void questaoUm() {
		for (count = 1; count <= 100; count++) {
			
			if (count % 2 != 0)
				System.out.println(count);
				sum += count;
		}
		System.out.println("A soma dos numeros impares é: " + sum);
	}
	
	public void questaoDois() {

		System.out.println("Digite um numero: ");
		int num = scanner.nextInt();
		
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}
	}
		
	public void questaoTres() {

		System.out.println("Digite um numero: ");
		int num = scanner.nextInt();
			
		for (int i = 0; num >= i; num--) {
			System.out.println(num);
		}
	}
	
	public void questaoQuatro() {

		System.out.println("Digite o primeiro numero: ");
		int num01 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num02 = scanner.nextInt();
		int soma = 0;
		
		
		while (num02 > 0) {
			soma += num01;
			num02--;
		}
		System.out.println("O total da soma é: " + soma);
	}
}
