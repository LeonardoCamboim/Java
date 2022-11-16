package Endereco;

public class Rua extends Pais {

	public Rua(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return String.format("[Rua: %s]%n", super.toString());
	}

}
