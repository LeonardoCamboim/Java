package formas;

import java.util.Scanner;

public class Quadrado {

	Scanner entrada = new Scanner(System.in);
	double lado, area, perimetro;
	    
	    
	public double calcularArea (){
	        
		area = lado*lado;
	        
	    return area;
	}
	public double calcularPerimetro (){
	        
		perimetro = 4*lado;
	        
	    return perimetro;
	}
	     
	public void imprimir(){
	        
		System.out.println("O quadrado de lado: "+lado+"\n Área: "+calcularArea()+"\nPerimetro: "+calcularPerimetro());
	}
	    
	public void lado(){
		System.out.println("Informe do valor do lado do quadrado");
	    lado = entrada.nextDouble();
	}
  
}

