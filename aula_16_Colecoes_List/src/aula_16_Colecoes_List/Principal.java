package aula_16_Colecoes_List;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
//		 M�todos
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
		boolean localizado = alunos.contains("Maria");
		int posicao = alunos.indexOf("Jo�o");
		
		if(posicao>=0) {
			String nome = alunos.get(posicao);
			System.out.printf("%s foi localizado(a) na posi��o %d da lista",nome,posicao);
			System.out.println("Maria � o(a) 2� aluno(a) da lista");
		}else {
			System.out.println("N�o foi localizado na lista");
		}

		// Remo��o de elementos
		int indiceRemocao = alunos.indexOf("Maria");
		alunos.remove(indiceRemocao);// Remover a Maria
		System.out.println(alunos.toString());

		alunos.removeIf((nome) -> nome.startsWith("Mar"));

		System.out.println(alunos.toString());

		// --------------------------------------------------

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// Adicionar os n�meros
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		System.out.println(numeros.toString());
		// num % 2 == 0 Logo � par
		numeros.removeIf((num) -> num % 2 != 0);
		System.out.println(numeros.toString());
	}

}
