package aula_07_trabalho2_Fisica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    Fisica calculo = new Fisica();
       
//		System.out.println("Ditige a massa");
//		float massa = teclado.nextFloat();
//		
//		System.out.println("Ditige a gravidade");
//		float gravidade = teclado.nextFloat();
//		
//		teclado.close();
//		
//		System.out.printf("A For�a Peso � de %.2fN",calculo.ForcaPeso(massa, gravidade));
	    
//		System.out.println("Ditige a massa");
//		float massa = teclado.nextFloat();
//		
//		System.out.println("Ditige a velocidade");
//		float velocidade = teclado.nextFloat();
//		
//		System.out.println("Ditige o raio");
//		float raio = teclado.nextFloat();
//		
//		teclado.close();
//		
//		System.out.printf("A For�a Centr�peta � de %.2fN",calculo.ForcaCentripeta(massa, velocidade, raio));
		
		System.out.println("Ditige a for�a");
		float forca = teclado.nextFloat();
		
		System.out.println("Ditige o tempo inicial");
		float tempoInit = teclado.nextFloat();
		
		System.out.println("Ditige o tempo final");
		float tempoFin = teclado.nextFloat();
		
		teclado.close();
		
		System.out.printf("O impulso � de %.2f",calculo.Impulso(forca, tempoInit, tempoFin));
	}

}
