
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		segundaConta.deposita(500);
		segundaConta.saca(1000);
		
		System.out.println(segundaConta.saldo());
		/*
		/boolean conseguiuRetirar = segundaConta.saca(50);
		System.out.println(conseguiuRetirar);
		
		boolean transferencia = segundaConta.transfere(50, primeiraConta);
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
	
		if(transferencia) {
			System.out.println("testando boolean");
		}
		Cliente leonardo = new Cliente();
		leonardo.cpf = "000.000.000-00";
		leonardo.nome = "Leonardo de Almeida Camboim";
		leonardo.profissao = "Contador";
		
		System.out.println(leonardo.cpf);
		primeiraConta.titular = leonardo;
		System.out.println(primeiraConta.titular.nome);*/
	}
}
