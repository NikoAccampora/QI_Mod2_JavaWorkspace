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
     	
		Cliente marcio = new Cliente("marcio","marcio@gmail.com");
		Cliente ana = new Cliente("ana","ana@gmail.com");
		
		// Adicinar na lista
		exec_listaDeClientes.addClientes(marcio);
		exec_listaDeClientes.addClientes(ana);
		
		// Listar elementos
		System.out.println(exec_listaDeClientes.listar());
		
     	// Modificar ana
		Cliente novaAna = new Cliente("Ana","ana@hotmail.com"); //Só edita o email(?) o nome deve ser o mesmo...
     	
		exec_listaDeClientes.editar(novaAna);
		
		System.out.println(exec_listaDeClientes.listar());
		
		// Remoção
//		exec_listaDeClientes.removeClientes(novaAna); //TANTO FAZ!!
		exec_listaDeClientes.removeClientes(ana);
		
		System.out.println(exec_listaDeClientes.listar());
		
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
