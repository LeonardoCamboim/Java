package Atividade07;

public class Carro {
	
	int anoDeFabricacao;
	String modelo;
	String fabricante;
    Roda roda;
	
	public Carro(int anoDeFabricacao, String modelo, String fabricante, Roda roda) {
		this.anoDeFabricacao = anoDeFabricacao;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.roda = roda;
	}

	public Roda getRoda() {
		return roda;
	}
}
