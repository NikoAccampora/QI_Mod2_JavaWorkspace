package aula_18_SistemaBancario;

import java.util.ArrayList;

public class listaDeClientes {
	
	ArrayList<Cliente> ListClientes = new ArrayList<Cliente>();
	
	  
	public void printClientes() {
		System.out.println(ListClientes.toString());
	}

	public void addClientes(Cliente cliente) {
		ListClientes.add(cliente);
	}
	
	
	public void removeClientes(String nome) {
		ListClientes.removeIf((cliente) -> cliente.getNome().equalsIgnoreCase(nome));
	}

}
