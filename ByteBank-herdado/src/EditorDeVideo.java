
public class EditorDeVideo extends Funcionario{
	
	public EditorDeVideo() {
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo gerente");
		return super.getSalario();
	}
	
}
