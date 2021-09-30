package aula_18_SistemaBancario;

import java.util.ArrayList;

public class listaDeGerentes {
	private ArrayList<Gerente> ListGerentes = new ArrayList<Gerente>();
	

	

	public void addGerentes(Gerente gerente) {
	//	if(gerente != null) {
		ListGerentes.add(gerente);
	//	}
	}
	
	public void removeGerentes(Gerente gerente) {	
		ListGerentes.removeIf((meuElemento)->meuElemento.getNome().equalsIgnoreCase(gerente.getNome()));
	}
	
	public Gerente buscar(Gerente gerente) {
		for(Gerente elemento : ListGerentes) {
			if(elemento.getNome().equalsIgnoreCase(gerente.getNome())) {
				return elemento;
			}
		}
		
		return null;
	}
	
	public void editar(Gerente meuObjGerente) {  //Nome de variável de método pode ser qualquer coisa :P é pra quando for botar no main.
		int indice = ListGerentes.indexOf(this.buscar(meuObjGerente));
		if(indice != -1) {
		ListGerentes.set(indice, meuObjGerente);
		}
	}
	
	public String listar(){
	    StringBuilder builder = new StringBuilder();
	    for(Gerente gerente : this.ListGerentes) {
	    	builder.append("Nome: "+gerente.getNome()+" - Telefone: "+gerente.getTelefone()+"\n");
	    }
		return builder.toString();
	} 
	
	
}
