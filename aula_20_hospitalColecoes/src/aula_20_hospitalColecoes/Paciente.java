package aula_20_hospitalColecoes;

public class Paciente {

	private String nome;
	private String cpf;
	private String rg;
	
	
	Paciente(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	Paciente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public String getRG() {
		return this.rg;
	}
	
	@Override
	public String toString() {
		return String.format("Paciente: %s\nCPF: %s\nRegistro Geral: %s\n\n", this.nome, this.cpf, this.rg);
	}
	
}
