package aula_15_exerciciosSwitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner typeMe = new Scanner(System.in);
		
	
//////EXERC�CIO 1 - TAXA DE NATALIDADE/MORTALIDADE
		
//		System.out.println("Digite 1 para taxa de natalidade ou 2 para taxa de mortalidade");
//		System.out.println("Ou digite 0 para cancelar");
//		byte option = typeMe.nextByte();
//		
//		switch(option) {
//		case 1:
//			int birthRate;
//			System.out.println("Digite o n�mero de nascimentos da cidade em quest�o:");
//			int typeBirths = typeMe.nextInt();
//			System.out.println("Digite a popula��o aproximada da cidade em quest�o:");
//			int typePopulation = typeMe.nextInt();
//			birthRate = calcBirthRate(typeBirths, typePopulation);
//			System.out.printf("A taxa de natalidade da cidade em quest�o � de %s.",birthRate);
//			break;
//		case 2:
//			int mortRate;
//			System.out.println("Digite o n�mero de mortes da cidade em quest�o:");
//			int typeDeaths = typeMe.nextInt();
//			System.out.println("Digite a popula��o aproximada da cidade em quest�o:");
//			int typePopulation1 = typeMe.nextInt();
//			mortRate = calcMortRate(typeDeaths, typePopulation1);
//			System.out.printf("A taxa de mortalidade da cidade em quest�o � de %s.",mortRate);
//			break;
//		case 0:
//			System.out.println("Opera��o cancelada.");
//			break;
//		default:
//			System.out.println("<OP��O INV�LIDA>");
//			break;
//
//
//
//
//	private  static int calcBirthRate(int births, int population) {
//		return (births * 1000) / population; 
//	}
//	
//	private static int calcMortRate(int deaths, int population) {
//		return (deaths * 1000) / population; 
//	}

		
//////EXERC�CIO 2 - PAGAMENTO
		
//	   System.out.println("Digite o valor total da compra:");
//		float price = typeMe.nextFloat();
//		System.out.println("Escolha m�todo de pagamento:");
//		System.out.println("1 - A Vista");
//		System.out.println("2 - A Prazo");
//		System.out.println("3 - Parcelado");
//		byte payMethod = typeMe.nextByte();
//		
//		switch(payMethod) {
//		case 1:
//			float checkout1 = (float) (price*0.9);
//			System.out.printf("O valor a pagar � de: %.2fR$",checkout1);
//			break;
//		case 2:
//			float checkout2 = (float) (price*1.05);
//			System.out.printf("O valor a ser pago fururamente � de: %.2fR$",checkout2);
//			break;
//		case 3:
//			float checkout3 = (float) ((price*1.015)/12);
//			System.out.printf("O valor a pagar � de: %.2fR$ Por M�s.",checkout3);
//			break;
//		default:
//			System.out.println("<OP��O INV�LIDA>");
//			break;
//		}
// }

		
}
	 
}
