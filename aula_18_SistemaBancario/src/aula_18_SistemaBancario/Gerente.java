package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Gerente {

	private String nome;
	
	public Gerente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return String.format("%s",this.nome);
	}
	
	
}





