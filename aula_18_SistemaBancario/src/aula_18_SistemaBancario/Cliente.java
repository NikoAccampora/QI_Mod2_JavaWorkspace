package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Cliente {

private String nome;
	
	public Cliente(String nome) {
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
