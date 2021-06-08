
public class CriaConta {
	
	public static void main(String[] args) {
		Cliente primeiroCliente = new Cliente();
		Conta primeiraConta = new Conta(1234, 25254, primeiroCliente);
		Conta segundaConta = new Conta(2524, 16454, primeiroCliente);
		segundaConta.deposita(500);
		segundaConta.saca(1000);
		
		primeiroCliente.setNome("Leonardo");
		
		System.out.println(primeiraConta.getTitular().getNome());
		
		System.out.println(Conta.getTotal());
		
		
		
		
		
		
		/*
		System.out.println(primeiroCliente.getNome());
	
		primeiroCliente.setNome("Leonardo");
		System.out.println(primeiroCliente.getNome());
		
		System.out.println(primeiraConta.getSaldo());
		System.out.println(segundaConta.getSaldo());
		
		segundaConta.transfere(200, primeiraConta);
		
		System.out.println(primeiraConta.getSaldo());
		System.out.println(segundaConta.getSaldo()); */
	}
}
