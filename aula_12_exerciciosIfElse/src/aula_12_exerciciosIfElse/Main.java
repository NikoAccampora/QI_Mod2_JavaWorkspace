package aula_12_exerciciosIfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner typeMe = new Scanner(System.in);
		
//////EXERC�CIO 1 - TRI�NGULO

		System.out.println("Digite a medida do 1� lado do tri�ngulo:");
		float side1 = typeMe.nextFloat();
		System.out.println("Digite a medida do 2� lado do tri�ngulo:");
		float side2 = typeMe.nextFloat();
		System.out.println("Digite a medida do 3� lado do tri�ngulo:");
		float side3 = typeMe.nextFloat();
		
		if((side1 == side2)&&(side2 == side3)&&(side1 == side3)) {
			System.out.println("O tri�ngulo � Equil�tero.");
		} else if((side1 != side2)&&(side2 != side3)&&(side1 != side3)) {
			System.out.println("O tri�ngulo � Escaleno.");
		} else if((side1 != side2)||(side2 != side3)||(side1 != side3)) {
			System.out.println("O tri�ngulo � is�sceles.");
		} else System.out.println("Algo deu errado...");
		

//////EXERC�CIO 2 - ANO BISSEXTO

		System.out.println("Digite um ano:");
		int leapYearCheck = typeMe.nextInt();
			
		if((leapYearCheck % 4 == 0)&&(leapYearCheck % 100 != 0)) {
		System.out.printf("O ano %s � bissexto.",leapYearCheck);
		} else if((leapYearCheck % 4 == 0)&&(leapYearCheck % 100 == 0)&&(leapYearCheck % 400 == 0)) {
	    System.out.printf("O ano %s � bissexto.",leapYearCheck);
		} else System.out.printf("O ano %s n�o � bissexto.",leapYearCheck);
	

//////EXERC�CIO 3 - ASSASSINATO
		
		int answerCount = 0;
		
		System.out.println("Responda as perguntas com 's' ou 'n' (sim ou n�o)");
		System.out.println("Telefonou para a v�tima?");
		String q1 = typeMe.next();
		if(q1.equalsIgnoreCase("s")) {answerCount++;}
		
		System.out.println("Esteve no local do crime?");
		String q2 = typeMe.next();
		if(q2.equalsIgnoreCase("s")) {answerCount++;}
		
		System.out.println("Mora perto da v�tima?");
		String q3 = typeMe.next();
		if(q3.equalsIgnoreCase("s")) {answerCount++;}
		
		System.out.println("Devia para a v�tima?");
		String q4 = typeMe.next();
		if(q4.equalsIgnoreCase("s")) {answerCount++;}
		
		System.out.println("J� trabalhou com a v�tima?");
		String q5 = typeMe.next();
		if(q5.equalsIgnoreCase("s")) {answerCount++;}
		
		
		if(answerCount==5) {
		System.out.println("Voc� � o Assassino!!!");
	} else if ((answerCount<5)&&(answerCount>2)) {
		System.out.println("Voc� � um c�mplice.");
	} else if (answerCount==2) {
		System.out.println("Voc� � suspeito.");
	} else System.out.println("Voc� � inocente.");
		
	
//////EXERC�CIO 4 - �LCOOL E GASOLINA
		
		float a_price = (float)0.19;
		float g_price = (float)0.39;
		

		System.out.println("Digite 'a' para �lcool ou 'g' para Gasolina:");
		String fill_decide = typeMe.next();
		if(fill_decide.equalsIgnoreCase("a")) {
			System.out.println("Fa�a seu pedido de �lcool (em litros):");
			float fill_amount = typeMe.nextFloat();
			
			if (fill_amount>20) {
			     float checkout = (float)((a_price*fill_amount)*0.95); 
			     System.out.printf("Valor a pagar em �lcool: %.2fR$\n",checkout);
			     System.out.println("(Voc� teve 5% de desconto)");
			} else {
				 float checkout = (float)((a_price*fill_amount)*0.97); 
				 System.out.printf("Valor a pagar em �lcool: %.2fR$\n",checkout);
				 System.out.println("(Voc� teve 3% de desconto)");
			}
		} 
		
		else if (fill_decide.equalsIgnoreCase("g")) {
	    
			System.out.println("Fa�a seu pedido de Gasolina (em litros):");
			float fill_amount = typeMe.nextFloat();
			
			if (fill_amount>20) {
			     float checkout = (float)((g_price*fill_amount)*0.94); 
			     System.out.printf("Valor a pagar em Gasolina: %.2fR$\n",checkout);
			     System.out.println("(Voc� teve 6% de desconto)");
			} else {
				 float checkout = (float)((g_price*fill_amount)*0.96); 
				 System.out.printf("Valor a pagar em Gasolina: %.2fR$\n",checkout);
				 System.out.println("(Voc� teve 4% de desconto)");
			}
			
		} else System.out.print("<OP��O INV�LIDA>");
}
}

		
	

