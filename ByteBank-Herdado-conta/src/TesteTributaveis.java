
public class TesteTributaveis {

	public static void main(String[] args) {

		
		ContaCorrente c1 = new ContaCorrente(1514, 25254);
		SeguroDeVida s1 = new SeguroDeVida();
		c1.deposita(1000);
		
		c1.getTitular().setNome("Leonardo");
		System.out.println(c1.getTitular().getNome());
	
		
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		
		calculadora.registra(c1);
		calculadora.registra(s1);
		
		System.out.println(calculadora.getTotalImposto());
	}

}
