package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		listaDeContas exec_listaDeContas = new listaDeContas();
		listaDeGerentes exec_listaDeGerentes = new listaDeGerentes();
		listaDeClientes exec_listaDeClientes = new listaDeClientes();
		//------------------------------------------------------------
		
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
      //exec_listaDeGerentes.removeGerentes(novaMaria); //TANTO FAZ!!
		exec_listaDeGerentes.removeGerentes(maria);
		
		System.out.println(exec_listaDeGerentes.listar());
		
////--------------------------=CLIENTES=-----------------------------		
		
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
      //exec_listaDeClientes.removeClientes(novaAna); //TANTO FAZ!!
		exec_listaDeClientes.removeClientes(ana);
		
		System.out.println(exec_listaDeClientes.listar());
		
////---------------------=CONTAS=-----------------------------
		
	    Conta conta1 = new Conta(1,200);
		Conta conta2 = new Conta(2,1000);
		
		Conta contaEditada = new Conta(1,500);
		
		exec_listaDeContas.addContas(conta1);
		exec_listaDeContas.addContas(conta2);
		
		System.out.println(exec_listaDeContas.listar());
		
		exec_listaDeContas.editar(contaEditada);
		
		System.out.println(exec_listaDeContas.listar());
		
		
	}

}
