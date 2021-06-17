
public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(2526, 25254);
		ContaPoupanca cp1 = new ContaPoupanca(1517, 12525);		
		cc1.getTitular().setNome("Leonardo de Almeida Camboim");
		
		cc1.deposita(150.0);
		cc1.transfere(25.00, cp1);
		
				
		System.out.println("CC: " + cc1.getSaldo());
		System.out.println("CP: " + cp1.getSaldo());
		
		cc1.saca(50.0);
		
		System.out.println("CC: " + cc1.getSaldo());
		System.out.println("CP: " + cp1.getSaldo());
		System.out.println(cc1.getTitular().getNome());
	}

}
