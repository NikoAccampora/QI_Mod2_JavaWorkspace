package aula_12_exerciciosIfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner typeMe = new Scanner(System.in);
		
		System.out.println("INSTRU��ES: Voc� deve digitar as medidas de cada lado do tri�ngulo em mil�metros(mm);");
		System.out.println("O sistema ir� decidir se o tri�ngulo � Equil�tero, is�sceles ou Escaleno");
		System.out.println("baseado nas suas medidas.");
		System.out.println("------=INICIAR=------");
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
	
	
	}


}
