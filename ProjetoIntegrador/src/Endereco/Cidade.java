package Endereco;

public class Cidade extends Pais {

	public Cidade(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return String.format("[Cidade: %s]%n",super.toString());
	}

}
