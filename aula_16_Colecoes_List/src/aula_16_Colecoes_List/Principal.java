package aula_16_Colecoes_List;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
	    // M�todos
		int tamanho = alunos.size();
		System.out.printf("A cole��o tem %d elementos\n",tamanho);
	    
	    alunos.add("Jo�o");
	    alunos.add("Maria");
	    alunos.add("Jos�");
	    
	    tamanho = alunos.size();
	    System.out.printf("Agora a lista tem %d elementos\n",tamanho);
	    
	    // Pegar os elementos
	    String ultimoAluno = alunos.get(tamanho-1);
	    String primeiroAluno = alunos.get(0);
	    System.out.printf("O primeiro aluno �: %s\n", primeiroAluno);
	    System.out.printf("O �ltimo aluno �: %s\n", ultimoAluno);
	    
	    // Alterar os elementos
	    alunos.set(2, "Mar�lia");
	    ultimoAluno = alunos.get(tamanho-1);
	    System.out.printf("O �ltimo aluno agora �: %s\n", ultimoAluno);
	    
	    // Localizar um elemento
//	    boolean localizado = alunos.contains("Mar�lia");
	    int posicao = alunos.indexOf("Mar�lia");
	    
	    if(posicao>=0) {
	    	String nome = alunos.get(posicao);
	    	System.out.printf("%s Foi localizado(a) na posi��o %d da lista\n",nome, posicao);
	    	System.out.printf("%s � o(a) %d� da lista\n",nome, posicao+1);
	    } else {
	    	System.out.println("N�o foi localizado na lista");
	    }
	}

}
