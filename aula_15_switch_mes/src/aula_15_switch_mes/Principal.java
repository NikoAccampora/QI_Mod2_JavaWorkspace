package aula_15_switch_mes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);   
        System.out.println("Digite um n�mero entre 1 � 12");
        byte numero = teclado.nextByte();
        		
        switch(numero) {
        case 1:
        	System.out.println("Seu m�s �: Janeiro");
        	break;
        case 2:
        	System.out.println("Seu m�s �: Fevereiro");
        	break;
        case 3:
        	System.out.println("Seu m�s �: Mar�o");
        	break;
        case 4:
        	System.out.println("Seu m�s �: Abril");
        	break;
        case 5:
        	System.out.println("Seu m�s �: Maio");
        	break;
        case 6:
        	System.out.println("Seu m�s �: Junho");
        	break;
        case 7:
        	System.out.println("Seu m�s �: Julho");
        	break;
        case 8:
        	System.out.println("Seu m�s �: Agosto");
        	break;
        case 9:
        	System.out.println("Seu m�s �: Setembro");
        	break;
        case 10:
        	System.out.println("Seu m�s �: Outubro");
        	break;
        case 11:
        	System.out.println("Seu m�s �: Novembro");
        	break;
        case 12:
        	System.out.println("Seu m�s �: Dezembro");
        	break;
        	default:
        	System.out.println("<N�MERO INV�LIDO>");
        	break;
        }
	}

}
