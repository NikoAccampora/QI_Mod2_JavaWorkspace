package aula_15_switch_mes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);   
        System.out.println("Digite um número entre 1 á 12");
        byte numero = teclado.nextByte();
        		
        switch(numero) {
        case 1:
        	System.out.println("Seu mês é: Janeiro");
        	break;
        case 2:
        	System.out.println("Seu mês é: Fevereiro");
        	break;
        case 3:
        	System.out.println("Seu mês é: Março");
        	break;
        case 4:
        	System.out.println("Seu mês é: Abril");
        	break;
        case 5:
        	System.out.println("Seu mês é: Maio");
        	break;
        case 6:
        	System.out.println("Seu mês é: Junho");
        	break;
        case 7:
        	System.out.println("Seu mês é: Julho");
        	break;
        case 8:
        	System.out.println("Seu mês é: Agosto");
        	break;
        case 9:
        	System.out.println("Seu mês é: Setembro");
        	break;
        case 10:
        	System.out.println("Seu mês é: Outubro");
        	break;
        case 11:
        	System.out.println("Seu mês é: Novembro");
        	break;
        case 12:
        	System.out.println("Seu mês é: Dezembro");
        	break;
        	default:
        	System.out.println("<NÚMERO INVÁLIDO>");
        	break;
        }
	}

}
