package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Gerente {

	private String nome;
	private String telefone;//!!
	
	Gerente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;//!!
	}
	
	Gerente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}

	
	
	
}





