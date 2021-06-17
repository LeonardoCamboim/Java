
public class ControledeBonificacoes {
	
	private double soma;
	
	
	public void registra(Funcionario g) {
		double boni = g.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
