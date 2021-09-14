package aula_02_hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Internacao {
	private Medico medico;
	private Paciente paciente;
	private String observacoes;
	private LocalDate dataInternacao;
	private LocalDate dataAlta;
	
	public Internacao(Paciente paciente,Medico medico) {
		this.paciente = paciente;
		this.medico = medico;
		this.dataInternacao = LocalDate.now();
	}
	
	public Internacao(Paciente paciente,Medico medico,LocalDate dataInternacao) {
		this.paciente = paciente;
		this.medico = medico;
		this.dataInternacao = dataInternacao;
	}
	
	// Getters
	public String getObservacoes() {
		return this.observacoes;
	}
	
	public LocalDate getDataInternacao() {
		return this.dataInternacao;
	}
	
	public LocalDate getDataAlta() {
		return this.dataAlta;
	}
	// Setters
	
	public void setMedico(Medico medico) {
    	this.medico = medico; 
    }
	
	public void setObservacoes(String observacao) {
    	this.observacoes = observacao; 
    }
	
	public void setDataAlta(LocalDate dataAlta) {
    	this.dataAlta = dataAlta; 
    }
	
//	public String dadosDoMedico() {
//		StringBuilder dados = new StringBuilder();
//		dados.append("Nome do médico: ");
//		dados.append(this.medico.getNomeCompleto());
//		dados.append("\tTelefone para contatos:");
//		dados.append(this.medico.getTelefoneContato());
//		return dados.toString();
//	}
	
////--------===Aula 10 - Exemplo metodo toString===--------
	private String formatarData(LocalDate data) {
	  if(data != null) {
		var formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		return formato.format(data);
	}
    return "Data Não informada!!!";	  
}
	
    @Override
    public String toString() {
    	return String.format("Dados do Médico:\n%s\nDados do Paciente:\n%s\nData da internação: %s\nData da alta: %s\nobservações:\n%s",this.medico.toString(),this.paciente.toString(),this.formatarData(this.dataInternacao),this.formatarData(this.dataAlta),this.observacoes) ;
    	//Veja o resultado na main.
    }
}
