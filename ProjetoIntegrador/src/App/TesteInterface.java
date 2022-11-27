package App;

public interface TesteInterface {
	
	//Implicitamente public, static and final.
	//Interfaces podem ter constantes.
	public static final int a = 01;
	
	static double registro2() {
		return 0;
	}
	
	// Com o novo Java metodos de interface podem ser default.
	default double registro() {
		return 25;
	}

}
