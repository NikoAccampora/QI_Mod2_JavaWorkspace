package aula_12_exerciciosIfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner typeMe = new Scanner(System.in);
		
		System.out.println("INSTRUÇÕES: Você deve digitar as medidas de cada lado do triângulo em milímetros(mm);");
		System.out.println("O sistema irá decidir se o triângulo é Equilátero, isósceles ou Escaleno");
		System.out.println("baseado nas suas medidas.");
		System.out.println("------=INICIAR=------");
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
	
	
	}


}
