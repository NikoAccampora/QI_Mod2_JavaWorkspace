package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String email;//!!
	
	Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;//!!
	}
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}

	
	
	
}
