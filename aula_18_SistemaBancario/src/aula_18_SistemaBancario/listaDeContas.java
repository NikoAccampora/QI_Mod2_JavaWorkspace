package aula_18_SistemaBancario;

import java.util.ArrayList;

public class listaDeContas {

	ArrayList<Conta> ListContas = new ArrayList<Conta>();
	

	public void addContas(Conta conta) {
	    if(conta != null) {
	    	ListContas.add(conta);
	    }
	}
	
	
	public void removeContas(Conta conta) {	
		ListContas.removeIf((meuElemento)->meuElemento.getNumero() == conta.getNumero());
	}
	
	public Conta buscar(Conta conta) {
		for(Conta elemento : this.ListContas) {//: = Para cada elemento nessa lista, guarda nessa vari�vel (tempor�rio pra esse m�todo)
			if(elemento.getNumero() == conta.getNumero()) {
				return elemento;
			}
		}
		return null;
	}
	
	public void editar(Conta meuObjConta) {  //Nome de vari�vel de m�todo pode ser qualquer coisa :P � pra quando for botar no main.
		int indice = ListContas.indexOf(this.buscar(meuObjConta));
		if(indice != -1) {
		ListContas.set(indice, meuObjConta);
		}
	}
	
	public String listar(){
	    StringBuilder builder = new StringBuilder();
	    for(Conta conta : this.ListContas) { //: = Para cada elemento nessa lista, guarda nessa vari�vel (tempor�rio pra esse m�todo)
	    	builder.append(conta.toString());
	    }
		return builder.toString();
	} 
}
