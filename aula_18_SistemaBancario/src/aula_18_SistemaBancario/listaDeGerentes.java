package aula_18_SistemaBancario;

import java.util.ArrayList;

public class listaDeGerentes {
	
ArrayList<Gerente> ListGerentes = new ArrayList<Gerente>();
	
  
	public void printGerentes() {
		System.out.println(ListGerentes.toString());
	}

	public void addGerentes(Gerente gerente) {
		ListGerentes.add(gerente);
	}
	
	public void editGerentes(Gerente gerente2,Gerente gerente3) {
//		ListGerentes.set(1,gerente2);
//		ListGerentes.set(2,gerente3);
//		
//		System.out.println(ListGerentes.toString());
	}
	
	public void getGerentes() {
//		int ListGenSize = ListGerentes.size();
//		Gerente firstGerente = ListGerentes.get(0);
//		Gerente lastGerente = ListGerentes.get(ListGenSize-1);
//		
//
//		System.out.println(ListGerentes.toString());
	}
	
	public void removeGerentes(String nome) {
		//ListGerentes.removeIf((gerente) -> gerente.getNome().endsWith("cio"));
		ListGerentes.removeIf((gerente) -> gerente.getNome().equalsIgnoreCase(nome));
	}

}
