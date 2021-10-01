package aula_18_SistemaBancario;

import java.util.ArrayList;

public class listaDeClientes {
	
	ArrayList<Cliente> ListClientes = new ArrayList<Cliente>();
	
	  
	public void addClientes(Cliente cliente) {
		 	if(cliente != null) {
			ListClientes.add(cliente);
		 	}
		}
		
		public void removeClientes(Cliente cliente) {	
			ListClientes.removeIf((meuElemento)->meuElemento.getCpf().equals(cliente.getCpf()));
		}
		
		public Cliente buscar(Cliente cliente) {
			for(Cliente elemento : this.ListClientes) {
				if(elemento.getCpf().equals(cliente.getCpf())) {
					return elemento;
				}
			}
			
			return null;
		}
		
		public void editar(Cliente meuObjCliente) {  //Nome de variável de método pode ser qualquer coisa :P é pra quando for botar no main.
			int indice = ListClientes.indexOf(this.buscar(meuObjCliente));
			if(indice != -1) {
			ListClientes.set(indice, meuObjCliente);
			}
		}
		
		public String listar(){
		    StringBuilder builder = new StringBuilder();
		    for(Cliente cliente : this.ListClientes) {//: = Para cada elemento nessa lista, guarda nessa variável (temporário pra esse método)
		    	builder.append(cliente.toString());
		    }
			return builder.toString();
		} 
		
		
	}
