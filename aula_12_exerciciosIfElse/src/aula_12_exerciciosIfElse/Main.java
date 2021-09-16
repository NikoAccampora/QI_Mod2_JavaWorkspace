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
		} else if((leapYearCheck % 4 != 0)&&(leapYearCheck % 400 != 0)) {
			System.out.printf("O ano %s não é bissexto.",leapYearCheck);
		} else if((leapYearCheck % 4 != 0)&&(leapYearCheck % 400 == 0)) {
			System.out.printf("O ano %s é bissexto.",leapYearCheck);
		} else System.out.printf("O ano %s não é bissexto.",leapYearCheck);
	

//////EXERCÍCIO 3 - ASSASSINATO
		
		System.out.println("Responda as perguntas com 0(não) ou 1(sim).");
		System.out.println("Telefonou para a vítima?");
		int q1 = typeMe.nextInt();
		
		System.out.println("Esteve no local do crime?");
		int q2 = typeMe.nextInt();
		
		System.out.println("Mora perto da vítima?");
		int q3 = typeMe.nextInt();
		
		System.out.println("Devia para a vítima?");
		int q4 = typeMe.nextInt();
		
		System.out.println("Já trabalhou com a vítima?");
		int q5 = typeMe.nextInt();
		
		if(q1+q2+q3+q4+q5==5) {
			System.out.println("Você é o Assassino!!!");
		} else if ((q1+q2+q3+q4+q5==4)||(q1+q2+q3+q4+q5==3)) {
			System.out.println("Você é um cúmplice.");
		} else if ((q1+q2+q3+q4+q5==2)||(q1+q2+q3+q4+q5==1)) {
			System.out.println("Você é suspeito.");
		} else System.out.println("Você é inocente.");
	    
		
	
//////EXERCÍCIO 4 - ÁLCOOL E GASOLINA
		
		float a_price = (float)0.19;
		float g_price = (float)0.39;
		
		System.out.println("Faça seu pedido de Álcool (em litros)");
		float a_req = typeMe.nextFloat();
		System.out.println("Faça seu pedido de Gasolina (em litros)");
		float g_req = typeMe.nextFloat();
		
		if (a_req>20) {
		     float a_check = (float)((a_price*a_req)*0.95); 
		     System.out.printf("Valor a pagar em Álcool: %.2fR$\n",a_check);
		     System.out.println("(Você teve 5% de desconto)");
		     System.out.println("");
		} else {
			 float a_check = (float)((a_price*a_req)*0.97); 
			 System.out.printf("Valor a pagar em Álcool: %.2fR$\n",a_check);
			 System.out.println("(Você teve 3% de desconto)");
		     System.out.println("");
		}
		
		if (g_req>20) {
		     float g_check = (float)((g_price*g_req)*0.94); 
		     System.out.printf("Valor a pagar em Gasolina: %.2fR$\n",g_check);
		     System.out.println("(Você teve 6% de desconto)");
		     System.out.println("");
		} else {
			 float g_check = (float)((g_price*g_req)*0.96); 
			 System.out.printf("Valor a pagar em Gasolina: %.2fR$\n",g_check);
			 System.out.println("(Você teve 4% de desconto)");
		     System.out.println("");
		}


	
	
}
}

		
	

