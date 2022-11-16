package Endereco;

public class Bairro extends Pais {

	public Bairro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("[Bairro: %s]%n",super.toString());
	}
}
