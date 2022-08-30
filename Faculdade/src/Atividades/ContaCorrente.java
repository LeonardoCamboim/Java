package Atividades;

public class ContaCorrente {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void saca(double valor) {
		if (saldo >= valor || valor > 0) {
			saldo -= valor;
		}
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
}
