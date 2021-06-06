
public class Conta{
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if (saca(valor) == true) {
			destino.deposita(valor);
			System.out.println("Transferencia efetuada com sucesso!");
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	} 
	
	public double saldo() {
		return this.saldo;
	}
}
