package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		listaDeGerentes exec_listaDeGerentes = new listaDeGerentes();
		listaDeClientes exec_listaDeClientes = new listaDeClientes();
		listaDeContas exec_listaDeContas = new listaDeContas();
		
		Gerente paulo = new Gerente("paulo","1111");
		Gerente maria = new Gerente("maria","2222");
		
		// Adicinar na lista
		exec_listaDeGerentes.addGerentes(paulo);
		exec_listaDeGerentes.addGerentes(maria);
		
		// Listar elementos
		System.out.println(exec_listaDeGerentes.listar());
		
     	// Modificar maria
		Gerente novaMaria = new Gerente("Maria","3333"); //Só edita o telefone(?) o nome deve ser o mesmo...
     	
		exec_listaDeGerentes.editar(novaMaria);
		
		System.out.println(exec_listaDeGerentes.listar());
		
		// Remoção
//		exec_listaDeGerentes.removeGerentes(novaMaria); //TANTO FAZ!!
		exec_listaDeGerentes.removeGerentes(maria);
		
		System.out.println(exec_listaDeGerentes.listar());
     	
     	//-----------------------
     	
     	Cliente andrei = new Cliente("andrei");
     	Cliente bobby = new Cliente("bobby");
     	Cliente timmy = new Cliente("timmy");
     	Cliente mike = new Cliente("mike");
     	Cliente anders = new Cliente("anders");
     	
     	exec_listaDeClientes.addClientes(andrei);
		exec_listaDeClientes.addClientes(bobby);
		exec_listaDeClientes.addClientes(timmy);
		exec_listaDeClientes.addClientes(mike);
		exec_listaDeClientes.addClientes(anders);
		
		exec_listaDeClientes.printClientes();
		
		exec_listaDeClientes.removeClientes("mike");
     	
		exec_listaDeClientes.printClientes();
		
		//------------------------------------------
		
     	
     	exec_listaDeContas.addContas(001);
		exec_listaDeContas.addContas(002);
		exec_listaDeContas.addContas(003);
		exec_listaDeContas.addContas(004);
		exec_listaDeContas.addContas(005);
		
		exec_listaDeContas.printContas();
		
		exec_listaDeContas.removeContas(3);
		exec_listaDeContas.removeContas(1);
     	
		exec_listaDeContas.printContas();

	}

}
