package aula_15_exerciciosSwitch;

import java.util.Scanner;

public class exerc2 {
	
//////EXERC�CIO 2 - PAGAMENTO
	
	public void exerc2app() {
	Scanner typeMe = new Scanner(System.in);
		
	System.out.println("Digite o valor total da compra:");
	float price = typeMe.nextFloat();
	System.out.println("Escolha m�todo de pagamento:");
	System.out.println("1 - A Vista");
	System.out.println("2 - A Prazo");
	System.out.println("3 - Parcelado");
	byte payMethod = typeMe.nextByte();
	
	switch(payMethod) {
	case 1:
		float checkout1 = (float) (price*0.9);
		System.out.printf("O valor a pagar � de: %.2fR$",checkout1);
		break;
	case 2:
		float checkout2 = (float) (price*1.05);
		System.out.printf("O valor a ser pago fururamente � de: %.2fR$",checkout2);
		break;
	case 3:
		System.out.println("Digite quantas parcelas em que voc� deseja pagar:");
		byte parcel = typeMe.nextByte();
		float checkout3 = (float) ((price*1.015)/parcel);
		System.out.printf("O valor a pagar � de: %.2fR$ Por M�s.",checkout3);
		break;
	default:
		System.out.println("<OP��O INV�LIDA>");
		break;
	}
}

}
