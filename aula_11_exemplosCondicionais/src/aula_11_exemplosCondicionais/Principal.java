package aula_11_exemplosCondicionais;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro n�mero:");
        float num1 = teclado.nextFloat();
        System.out.println("Digite o segundo n�mero:");
        float num2 = teclado.nextFloat();
        
        float maior = maiorNumero(num1,num2);
        
        if(maior == 0) {
        	System.out.println("Os n�meros s�o iguais!!!");
        } else {
        	System.out.printf("O maior n�mero � o %.1f; ", maior);
        }
        
        boolean num1Positivo = ePositivo(num1);
        boolean num2Positivo = ePositivo(num2);
        
//  ////      System.out.printf("O primeiro n�mero � positivo? -> %b! ", num1Positivo);
//  ////      System.out.printf("O segundo n�mero � positivo? -> %b!", num2Positivo);
//        
        if(num1Positivo) {
        	System.out.println("O primeiro n�mero � positivo; ");
        } else {
        	System.out.println("O primeiro n�mero � negativo; ");
        } 
        if(num2Positivo) {
        	System.out.println("O segundo n�mero � positivo.");
        } else {
        	System.out.println("O segundo n�mero � negativo.");
        }
    
        
        System.out.println("Digite uma letra:");
        String letra = teclado.next();
        
        boolean eVogal = eVogal(letra);
        
        if(eVogal) {
        	System.out.printf("A %s � uma vogal.",letra);
        } else {
        	System.out.printf("A %s N�O � uma vogal!", letra);
        }

         System.out.println("Digite o seu sexo('M' ou 'F')");
         String sexo = teclado.next();
         
         String resultado = verificarSexo(sexo);
         System.out.printf("Seu sexo � %s\n",resultado);
        }
	
	private static float maiorNumero(float num1, float num2) {
		// Primeiro if
		if(num1==num2) {
			return 0;
		}
		// 'else' � opcional.
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
			return "Sexo inv�lido!";	
		}
	}


}
	

