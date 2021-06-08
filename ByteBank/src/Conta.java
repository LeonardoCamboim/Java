
public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia,int numero,Cliente titular) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
