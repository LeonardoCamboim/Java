package atividade04;

public class ContaCorrente {

	int senha;
	double saldo;
	
	public void sacar(double valor) {
		if (saldo >= valor || valor > 0) {
			saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;

	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
