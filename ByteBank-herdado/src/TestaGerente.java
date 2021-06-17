
public class TestaGerente {
	public static void main(String[] args) {


		Funcionario f1 = new Gerente();
		Gerente g1 = new Gerente();
		ControledeBonificacoes c1 = new ControledeBonificacoes();
		
		System.out.println(g1.autentica(0));
		
		g1.setNome("Leonardo Camboim");
		g1.setCpf("000.000.000-00");
		g1.setSalario(15000);
		
		System.out.println(g1.getBonificacao());
		
		c1.registra(g1);
		c1.registra(f1);
		
		System.out.println(f1.getSalario());
		
		System.out.println(c1.getSoma());
		
	}
}
