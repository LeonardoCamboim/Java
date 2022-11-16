package Endereco;

public class Estado extends Pais {	
	
	public Estado(String nome) {
		super(nome);
		super.addEstado(this);
	}

	@Override
	public String toString() {
		return String.format(" [Estado: %s]%n",super.toString());
	}

}
