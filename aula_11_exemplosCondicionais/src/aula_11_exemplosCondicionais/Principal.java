package aula_11_exemplosCondicionais;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
        Random rand = new Random();
		int valor1 = rand.nextInt(4);
        int valor2 = rand.nextInt(4);
        int valor3 = rand.nextInt(4);
        int valor4 = rand.nextInt(4);
        
        boolean comp1 = valor1 == valor2;
        boolean comp2 = valor3 == valor4;
        
        boolean comp3 = valor3 > valor2;
        boolean comp4 = valor4 <= valor1;
        
//        System.out.printf("É verdade que valor 1 é igual ao valor 2: %b\n",comp1);
//        
//        System.out.printf("É verdade que valor 3 é igual ao valor 4: %b\n",comp2);
//        
//        System.out.printf("É verdade que valor 3 é maior que valor 2: %b\n",comp3);
          
        boolean logico1 = comp1 || comp4;  
        boolean logico2 = comp3 && comp2; 
        
//        System.out.printf("O logico 1 é verdadeiro: %b\n",logico1);
//        System.out.printf("O logico 2 é verdadeiro: %b\n",logico2);
        
        boolean souAlunoQI = true;
        boolean estouMatriculadoNaAssis = true;
        boolean estouMatriculadoNaNoite = false;
        boolean estouMatriculadoNaTurmaDoMelhorProfessorDaQI = false;
        
        // Posso usar o PC da escola?
        if(souAlunoQI) {
        	System.out.println("Pode usar o PC da escola.");
        } else {
        	System.out.println("NÃO pode usar o PC da escola!");
        }
        
        // Posso participar da aula de Web III
        if((estouMatriculadoNaAssis && estouMatriculadoNaNoite) || estouMatriculadoNaTurmaDoMelhorProfessorDaQI) {
        	System.out.println("Você pode assistir a aula de Web III!!!");
        } else {
        	System.out.println("Você NÃO pode assistir a aula de Web III!!!");
        }
	
	}
	
}

