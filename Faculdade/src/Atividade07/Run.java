package Atividade07;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Questão 01
	
		Produtos produto01 = new Produtos("Celular", 2550.00, 25);
		
		System.out.println(produto01.verificaValorTotalEstoque());

		
		// Questão 02
		
		Roda aro15 = new Roda(15, "Pirreli");
		Carro polo = new Carro(2020, "Polo", "volkswagen", aro15);
		
		
	}

}
