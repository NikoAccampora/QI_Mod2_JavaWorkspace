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
//		System.out.printf("A For�a Peso � de %.2f N",calculo.ForcaPeso(massa, gravidade));
	    
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
//		System.out.printf("A For�a Centr�peta � de %.2f N",calculo.ForcaCentripeta(massa, velocidade, raio));
		
//		System.out.println("Ditige a for�a");
//		float forca = teclado.nextFloat();
//		
//		System.out.println("Ditige o tempo inicial");
//		float tempo1 = teclado.nextFloat();
//		
//		System.out.println("Ditige o tempo final");
//		float tempo2 = teclado.nextFloat();
//		
//		teclado.close();
//		
//		System.out.printf("A grandeza do impulso � de %.2f N/s",calculo.Impulso(forca, tempo1, tempo2));
		
//		System.out.println("Ditige a constante el�stica");
//		float constElastic = teclado.nextFloat();
//		
//		System.out.println("Ditige o n�vel da deforma��o");
//		float deforma��o = teclado.nextFloat();
//		
//		teclado.close();
//		
//		System.out.printf("A for�a el�stica � de %.2f N",calculo.ForcaElastica(constElastic, deforma��o));
	    
		System.out.println("Ditige a posi��o inicial em metros");
		float pos1 = teclado.nextFloat();
		
		System.out.println("Ditige a posi��o final em metros");
		float pos2 = teclado.nextFloat();
		
		System.out.println("Ditige o tempo inicial em segundos");
		float tempo1 = teclado.nextFloat();
		
		System.out.println("Ditige o tempo final em segundos");
		float tempo2 = teclado.nextFloat();
		
		teclado.close();
		
		System.out.printf("A velocidade m�dia � de %.2f km/h",calculo.VelocidadeMedia(tempo1, tempo2, pos1, pos2));
	    
//	    System.out.println("Ditige a posi��o inicial do objeto em metros");
//		float posicao = teclado.nextFloat();
//	    
//	    System.out.println("Ditige a velocidade do movimento em m/s");
//		float velocidade = teclado.nextFloat();
//		
//		System.out.println("Ditige o tempo final em segundos");
//		float tempo = teclado.nextFloat();
//		
//		teclado.close();
//		
//		System.out.printf("A fun��o hor�ria da posi��o do objeto � de %.2f m",calculo.MovimentoUniforme(velocidade, tempo, posicao));
	    
//	    System.out.println("Ditige a acelera��o m�dia em m/s");
//		float aceleracao = teclado.nextFloat();
//	    
//	    System.out.println("Ditige a velocidade m�dia em m/s");
//		float velocidade = teclado.nextFloat();
//		
//		System.out.println("Ditige o tempo final em segundos");
//		float tempo = teclado.nextFloat();
//		
//		teclado.close();
//		
//		System.out.printf("A fun��o hor�ria da velocidade � de %.2f m/s",calculo.MovimentoUniformeVariado(aceleracao, tempo, velocidade));
	}

}
