package aula_12_exerciciosIfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner typeMe = new Scanner(System.in);
		
//////EXERCÍCIO 1 - TRIÂNGULO

		System.out.println("Digite a medida do 1ª lado do triângulo:");
		float side1 = typeMe.nextFloat();
		System.out.println("Digite a medida do 2ª lado do triângulo:");
		float side2 = typeMe.nextFloat();
		System.out.println("Digite a medida do 3ª lado do triângulo:");
		float side3 = typeMe.nextFloat();
		
		if((side1 == side2)&&(side2 == side3)&&(side1 == side3)) {
			System.out.println("O triângulo é Equilátero.");
		} else if((side1 != side2)&&(side2 != side3)&&(side1 != side3)) {
			System.out.println("O triângulo é Escaleno.");
		} else if((side1 != side2)||(side2 != side3)||(side1 != side3)) {
			System.out.println("O triângulo é isósceles.");
		} else System.out.println("Algo deu errado...");
		

//////EXERCÍCIO 2 - ANO BISSEXTO

		System.out.println("Digite um ano:");
		int leapYearCheck = typeMe.nextInt();
			
		if((leapYearCheck % 4 == 0)&&(leapYearCheck % 100 != 0)) {
		System.out.printf("O ano %s é bissexto.",leapYearCheck);
		} else if((leapYearCheck % 4 == 0)&&(leapYearCheck % 100 == 0)&&(leapYearCheck % 400 == 0)) {
	    System.out.printf("O ano %s é bissexto.",leapYearCheck);
		} else System.out.printf("O ano %s não é bissexto.",leapYearCheck);
	

//////EXERCÍCIO 3 - ASSASSINATO
		
		int answerCount = 0;
		
		System.out.println("Responda as perguntas com 's' ou 'n' (sim ou não)");
		System.out.println("Telefonou para a vítima?");
		String q1 = typeMe.next();
		if(q1.equalsIgnoreCase("s")) {answerCount++;}
		
		System.out.println("Esteve no local do crime?");
		String q2 = typeMe.next();
		if(q2.equalsIgnoreCase("s")) {answerCount++;}
		
		System.out.println("Mora perto da vítima?");
		String q3 = typeMe.next();
		if(q3.equalsIgnoreCase("s")) {answerCount++;}
		
		System.out.println("Devia para a vítima?");
		String q4 = typeMe.next();
		if(q4.equalsIgnoreCase("s")) {answerCount++;}
		
		System.out.println("Já trabalhou com a vítima?");
		String q5 = typeMe.next();
		if(q5.equalsIgnoreCase("s")) {answerCount++;}
		
		
		if(answerCount==5) {
		System.out.println("Você é o Assassino!!!");
	} else if ((answerCount<5)&&(answerCount>2)) {
		System.out.println("Você é um cúmplice.");
	} else if (answerCount==2) {
		System.out.println("Você é suspeito.");
	} else System.out.println("Você é inocente.");
		
	
//////EXERCÍCIO 4 - ÁLCOOL E GASOLINA
		
		float a_price = (float)0.19;
		float g_price = (float)0.39;
		

		System.out.println("Digite 'a' para Álcool ou 'g' para Gasolina:");
		String fill_decide = typeMe.next();
		if(fill_decide.equalsIgnoreCase("a")) {
			System.out.println("Faça seu pedido de Álcool (em litros):");
			float fill_amount = typeMe.nextFloat();
			
			if (fill_amount>20) {
			     float checkout = (float)((a_price*fill_amount)*0.95); 
			     System.out.printf("Valor a pagar em Álcool: %.2fR$\n",checkout);
			     System.out.println("(Você teve 5% de desconto)");
			} else {
				 float checkout = (float)((a_price*fill_amount)*0.97); 
				 System.out.printf("Valor a pagar em Álcool: %.2fR$\n",checkout);
				 System.out.println("(Você teve 3% de desconto)");
			}
		} 
		
		else if (fill_decide.equalsIgnoreCase("g")) {
	    
			System.out.println("Faça seu pedido de Gasolina (em litros):");
			float fill_amount = typeMe.nextFloat();
			
			if (fill_amount>20) {
			     float checkout = (float)((g_price*fill_amount)*0.94); 
			     System.out.printf("Valor a pagar em Gasolina: %.2fR$\n",checkout);
			     System.out.println("(Você teve 6% de desconto)");
			} else {
				 float checkout = (float)((g_price*fill_amount)*0.96); 
				 System.out.printf("Valor a pagar em Gasolina: %.2fR$\n",checkout);
				 System.out.println("(Você teve 4% de desconto)");
			}
			
		} else System.out.print("<OPÇÃO INVÁLIDA>");
}
}

		
	

