package aula_15_switch_loja;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);   
		
		System.out.println("Digitar o total da venda");
		float total = teclado.nextFloat();
		System.out.println("Escolha o tipo de cliente");
		System.out.println("1 - Comum");
		System.out.println("2 - VIP");
		System.out.println("3 - Funcionário");
		byte tipo = teclado.nextByte();
		
		switch(tipo) {
		case 1:
			total = calcularDesconto(0, total);
			System.out.printf("O total da compra é %.2fR$",total);
			break;
		case 2:
			total = calcularDesconto(0.05f, total);
			System.out.printf("O total da compra é %.2fR$",total);
			break;
		case 3:
			total = calcularDesconto(0.1f, total);
			System.out.printf("O total da compra é %.2fR$",total);
			break;
			default:
			System.out.println("<OPÇÃO INVÁLIDA>");
			break;
		}
	}
	
	private static float calcularDesconto(float desconto, float totalDaVenda) {
		return totalDaVenda - totalDaVenda * desconto; 
	}

}
