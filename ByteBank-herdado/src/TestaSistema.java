
public class TestaSistema {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		Administrador a1 = new Administrador();
		SistemaInterno s1 = new SistemaInterno();
		EditorDeVideo e1 = new EditorDeVideo();
		Cliente c1 = new Cliente();
		
		
		g1.setSenha(2526);
		a1.setSenha(2526);
		c1.setSenha(2526);
		
		s1.autentica(g1);
		s1.autentica(a1);
		s1.autentica(c1);
	}
}
