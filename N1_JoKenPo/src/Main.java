import java.util.Random;	
import java.util.Scanner;

public class Main {
	
	public static int Pscore;
	public static int Cscore;
	public static int num_rounds=1;
	
//AJUSTE AQUI O NÚMERO MÁXIMO DE ROUNDS(0 = Rounds Infinitos)	
	public static int max_rounds=0;
	
	public static void main(String[] args) {
		Scanner typeMe = new Scanner(System.in);
		Random randomGen = new Random();
		
		if(num_rounds==max_rounds) {stopGame();} else {
		
		System.out.printf("---=ROUND %s=---\n",num_rounds);
		System.out.println("Faça sua jogada! Digite 1, 2 ou 3;");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("0 - Terminar Jogo");
		byte playerMove = typeMe.nextByte();
		byte comMove = (byte) (randomGen.nextInt(3)+1);
		
		if(playerMove==1) {
        	if(comMove==1) {
        		System.out.println("Você Sacou PEDRA"); 
        		System.out.println("Computador Sacou PEDRA");
        		System.out.println("<< Round empatado >>");
        		num_rounds++;
        		main(args);
        	} else if(comMove==2) {
        		System.out.println("Você Sacou PEDRA"); 
        		System.out.println("Computador Sacou PAPEL");
        		System.out.println("<< +1 Ponto para o Computador >>");
        		num_rounds++;
        		Cscore++;
        		main(args);
        	} else if(comMove==3) {
        		System.out.println("Você Sacou PEDRA"); 
        		System.out.println("Computador Sacou TESOURA");
        		System.out.println("<< +1 Ponto para Você :) >>");
        		num_rounds++;
        		Pscore++;
        		main(args);
        	} 
        } else if(playerMove==2)  {
            	if(comMove==1) {
            		System.out.println("Você Sacou PAPEL");
            		System.out.println("Computador Sacou PEDRA");
            		System.out.println("<< +1 Ponto para Você :) >>");
            		num_rounds++;
            		Pscore++;
            		main(args);
            	} else if(comMove==2) {
            		System.out.println("Você Sacou PAPEL");
            		System.out.println("Computador Sacou PAPEL");
            		System.out.println("<< Round empatado >>");
            		num_rounds++;
            		main(args);
            	} else if(comMove==3) {
            		System.out.println("Você Sacou PAPEL");
            		System.out.println("Computador Sacou TESOURA");
            		System.out.println("<< +1 Ponto para o Computador >>");
            		num_rounds++;
            		Cscore++;
            		main(args);
            	}
            } else if(playerMove==3)  {
            	if(comMove==1) {
            		System.out.println("Você Sacou TESOURA");
            		System.out.println("Computador Sacou PEDRA");
            		System.out.println("<< +1 Ponto para o Computador >>");
            		num_rounds++;
            		Cscore++;
            		main(args);
            	} else if(comMove==2) {
            		System.out.println("Você Sacou TESOURA");
            		System.out.println("Computador Sacou PAPEL");
            		System.out.println("<< +1 Ponto para Você :) >>");
            		num_rounds++;
            		Pscore++;
            		main(args);
            	} else if(comMove==3) {
            		System.out.println("Você Sacou TESOURA");
            		System.out.println("Computador Sacou TESOURA");
            		System.out.println("<< Round empatado >>");
            		num_rounds++;
            		main(args);
            	}
            } else if(playerMove==0) {
            	stopGame();
            } else if((playerMove!=1)||(playerMove!=2)||(playerMove!=3)||(playerMove!=0)) {
            	System.out.println("NUMERO INVÁLIDO! >:(");
            	main(args);
            }
	} 
	}
	
	public static void stopGame() {
		System.out.println("---=!FIM DE JOGO!=---");
		System.out.println("--Pontuação Total--");
		System.out.printf("Você       - %s\n",Pscore);
		System.out.printf("Computador - %s\n",Cscore);
		if(Pscore>Cscore) {
			System.out.println("<<< VOCÊ VENCEU!!! :D >>>");
		} else if(Pscore<Cscore) {
			System.out.println("<<< VOCÊ PERDEU! :'( >>>");
		} else if(Pscore==Cscore) {
			System.out.println("<<< EMPATE TOTAL! :O >>>");
		} 
		
	}
} 
