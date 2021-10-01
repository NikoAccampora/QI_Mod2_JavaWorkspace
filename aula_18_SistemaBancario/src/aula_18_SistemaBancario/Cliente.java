package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String cpf;//!!
	
	Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;//!!
	}
	
	Cliente(String cpf) {
		this.nome = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}

	@Override
	public String toString() {
		return String.format("Nome do cliente: %s\nCPF do cliente: %s\n\n", this.nome, this.cpf);
	}
	
}
