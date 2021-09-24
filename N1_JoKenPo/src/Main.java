import java.util.Random;	
import java.util.Scanner;

public class Main {
	
	public static int Pscore;
	public static int Cscore;
	public static int num_rounds=1;
	
	public static void main(String[] args) {
		Scanner typeMe = new Scanner(System.in);
		Random randomGen = new Random();
		System.out.printf("---=ROUND %s=---\n",num_rounds);
		System.out.println("Faça sua jogada! Digite 1, 2 ou 3;");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		byte playerMove = typeMe.nextByte();
		byte comMove = (byte) (randomGen.nextInt(3)+1);
		
        if(playerMove==1) {
        	if(comMove==1) {
        		System.out.println("Você Sacou PEDRA"); 
        		System.out.println("Computador Sacou PEDRA");
        		System.out.println("EMPATE! :o");
        		num_rounds++;
        		Main.main(args);
        	} else if(comMove==2) {
        		System.out.println("Você Sacou PEDRA"); 
        		System.out.println("Computador Sacou PAPEL");
        		System.out.println("Você PERDEU! :(");
        		num_rounds++;
        		Main.main(args);
        	} else if(comMove==3) {
        		System.out.println("Você Sacou PEDRA"); 
        		System.out.println("Computador Sacou TESOURA");
        		System.out.println("Você VENCEU! :D");
        		num_rounds++;
        		Pscore++;
        		Main.main(args);
        	} 
        } else if(playerMove==2)  {
            	if(comMove==1) {
            		System.out.println("Você Sacou PAPEL");
            		System.out.println("Computador Sacou PEDRA");
            		System.out.println("Você VENCEU! :D");
            		num_rounds++;
            		Pscore++;
            		Main.main(args);
            	} else if(comMove==2) {
            		System.out.println("Você Sacou PAPEL");
            		System.out.println("Computador Sacou PAPEL");
            		System.out.println("EMPATE! :o");
            		num_rounds++;
            		Main.main(args);
            	} else if(comMove==3) {
            		System.out.println("Você Sacou PAPEL");
            		System.out.println("Computador Sacou TESOURA");
            		System.out.println("Você PERDEU! :(");
            		num_rounds++;
            		Main.main(args);
            	}
            } else if(playerMove==3)  {
            	if(comMove==1) {
            		System.out.println("Você Sacou TESOURA");
            		System.out.println("Computador Sacou PEDRA");
            		System.out.println("Você PERDEU! :(");
            		num_rounds++;
            		Main.main(args);
            	} else if(comMove==2) {
            		System.out.println("Você Sacou TESOURA");
            		System.out.println("Computador Sacou PAPEL");
            		System.out.println("Você VENCEU! :D");
            		num_rounds++;
            		Pscore++;
            		Main.main(args);
            	} else if(comMove==3) {
            		System.out.println("Você Sacou TESOURA");
            		System.out.println("Computador Sacou TESOURA");
            		System.out.println("EMPATE! :o");
            		num_rounds++;
            		Main.main(args);
            	}
            } else if((playerMove!=1)||(playerMove!=2)||(playerMove!=3)) {
            	System.out.println("NUMERO INVÁLIDO! >:(");
            	Main.main(args);
            }
	} 
} 
