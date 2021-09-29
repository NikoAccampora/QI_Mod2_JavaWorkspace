package aula_18_SistemaBancario;

import java.util.ArrayList;

public class listaDeContas {

	ArrayList<Integer> ListContas = new ArrayList<Integer>(Conta.numero);
	
	  
	public void printContas() {
		System.out.println(ListContas);
	}

	public void addContas(int numero) {
		ListContas.add(numero);
	}
	
	
	public void removeContas(int numero) {
		ListContas.remove(numero);
	}
	
}
