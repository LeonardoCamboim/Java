// Grupo: Leonardo de Almeida Camboim, André felipe Santos Alexandre, Guilherme Monteiro Dias Filho
package ted05;

public class AtividadeTed05 {

	public void questaoUm() {
		
		int i;
		i = 1;
		
		while (i <= 20) {
			
			if (i % 5 != 0) {
				System.out.print(i);
				System.out.print('\t');
			} else {
				System.out.println(i);
			}
			
			i++;
		}
	}
}