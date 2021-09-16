package aula_11_exemplosCondicionais;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        float num1 = teclado.nextFloat();
        System.out.println("Digite o segundo número:");
        float num2 = teclado.nextFloat();
        
        float maior = maiorNumero(num1,num2);
        
        if(maior == 0) {
        	System.out.println("Os números são iguais!!!");
        } else {
        	System.out.printf("O maior número é o %.1f; ", maior);
        }
        
        boolean num1Positivo = ePositivo(num1);
        boolean num2Positivo = ePositivo(num2);
        
//  ////      System.out.printf("O primeiro número é positivo? -> %b! ", num1Positivo);
//  ////      System.out.printf("O segundo número é positivo? -> %b!", num2Positivo);
//        
        if(num1Positivo) {
        	System.out.println("O primeiro número é positivo; ");
        } else {
        	System.out.println("O primeiro número é negativo; ");
        } 
        if(num2Positivo) {
        	System.out.println("O segundo número é positivo.");
        } else {
        	System.out.println("O segundo número é negativo.");
        }
    
        
        System.out.println("Digite uma letra:");
        String letra = teclado.next();
        
        boolean eVogal = eVogal(letra);
        
        if(eVogal) {
        	System.out.printf("A %s é uma vogal.",letra);
        } else {
        	System.out.printf("A %s NÃO é uma vogal!", letra);
        }

         System.out.println("Digite o seu sexo('M' ou 'F')");
         String sexo = teclado.next();
         
         String resultado = verificarSexo(sexo);
         System.out.printf("Seu sexo é %s\n",resultado);
        }
	
	private static float maiorNumero(float num1, float num2) {
		// Primeiro if
		if(num1==num2) {
			return 0;
		}
		// 'else' é opcional.
		// Segundo if
		if(num1>num2) {
		 return num1;
	}
	return num2;
  }
	
	private static boolean ePositivo(float num) {
		return num > -1;
	}
	
	private static boolean eVogal(String letra) {
		return letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u");
	}

	private static String verificarSexo(String sexo) {
		if(sexo.equalsIgnoreCase("M")) {
		  return "Masculino";	
		} else if(sexo.equalsIgnoreCase("F")) {
			return "Feminino";	
		} else {
			return "Sexo inválido!";	
		}
	}


}
	

