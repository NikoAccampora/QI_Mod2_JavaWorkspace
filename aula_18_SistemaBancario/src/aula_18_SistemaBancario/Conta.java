package aula_18_SistemaBancario;

import java.util.ArrayList;

public class Conta {
	
	private int numero;
	private float saldo;
	
	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public Conta(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return String.format("Nº %s\nSaldo: %.2f\n\n", this.numero, this.saldo);
	}
	
	
}
