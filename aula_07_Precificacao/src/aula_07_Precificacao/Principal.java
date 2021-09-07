package aula_07_Precificacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto prod = new Produto();
		
		System.out.println("Ditige o nome do produto");
		prod.nome = teclado.nextLine();
		
		System.out.println("Ditige o preço de compra do produto");
		prod.precoDeCusto = teclado.nextFloat();
		//-----OPTIONAL-v
		System.out.println("Ditige o seu custo fixo");
		float custoFixo = teclado.nextFloat();
		
		System.out.println("Ditige o seu lucro desejado");
		float lucro = teclado.nextFloat();
		//-----OPTIONAL-^
		System.out.println("Ditige o quantidade do produto");
		prod.quantidade = teclado.nextByte();
		
		teclado.close();
		
		//float precoDeVenda = prod.calcularPrecoDeVenda(100, 200);
		float precoDeVenda = prod.calcularPrecoDeVenda(custoFixo, lucro);
		
		System.out.printf("O preço de venda do produto %s é de R$ %.2f UN",prod.nome,precoDeVenda);
	}

}
