package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		listaDeGerentes exec_listaDeGerentes = new listaDeGerentes();
		listaDeClientes exec_listaDeClientes = new listaDeClientes();
		
		Gerente paulo = new Gerente("paulo");
		Gerente marcio = new Gerente("marcio");
		Gerente otis = new Gerente("otis");
		Gerente barney = new Gerente("barney");
		
		
		exec_listaDeGerentes.addGerentes(paulo);
		exec_listaDeGerentes.addGerentes(marcio);
		exec_listaDeGerentes.addGerentes(otis);
		exec_listaDeGerentes.addGerentes(barney);
		
		exec_listaDeGerentes.printGerentes();
		
     	exec_listaDeGerentes.removeGerentes("marcio");
     	
     	exec_listaDeGerentes.printGerentes();
     	
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

	}

}
