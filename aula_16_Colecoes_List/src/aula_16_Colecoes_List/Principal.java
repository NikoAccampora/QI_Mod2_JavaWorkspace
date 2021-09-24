package aula_16_Colecoes_List;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
	    // Métodos
		int tamanho = alunos.size();
		System.out.printf("A coleção tem %d elementos\n",tamanho);
	    
	    alunos.add("João");
	    alunos.add("Maria");
	    alunos.add("José");
	    
	    tamanho = alunos.size();
	    System.out.printf("Agora a lista tem %d elementos\n",tamanho);
	    
	    // Pegar os elementos
	    String ultimoAluno = alunos.get(tamanho-1);
	    String primeiroAluno = alunos.get(0);
	    System.out.printf("O primeiro aluno é: %s\n", primeiroAluno);
	    System.out.printf("O último aluno é: %s\n", ultimoAluno);
	    
	    // Alterar os elementos
	    alunos.set(2, "Marília");
	    ultimoAluno = alunos.get(tamanho-1);
	    System.out.printf("O último aluno agora é: %s\n", ultimoAluno);
	    
	    // Localizar um elemento
//	    boolean localizado = alunos.contains("Marília");
	    int posicao = alunos.indexOf("Marília");
	    
	    if(posicao>=0) {
	    	String nome = alunos.get(posicao);
	    	System.out.printf("%s Foi localizado(a) na posição %d da lista\n",nome, posicao);
	    	System.out.printf("%s é o(a) %dº da lista\n",nome, posicao+1);
	    } else {
	    	System.out.println("Não foi localizado na lista");
	    }
	}

}
