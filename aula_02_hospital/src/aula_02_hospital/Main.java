package aula_02_hospital;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// Criando um objeto
		Endereco end1 = new Endereco();
		Paciente pac1 = new Paciente();
		
		//Popular os dados
		end1.setBairro("Centro");
		end1.setCEP("0000");
		end1.setCidade("Porto Alegre");
		end1.setEstado("RS");
		end1.setNumero("12-A");
		end1.setRua("Travessa não te interessa");
		
		pac1.cpf = "000";
		pac1.nomeCompleto = "João Paulo Nogueiro";
		pac1.rg = "9999";
		pac1.telefone = "99999";
		pac1.endereco = end1;
		
		// Imprimir dados
		System.out.printf("O senhor %s reside no endereço %s\n nº %s,no bairro %s - %s/%s",
				pac1.nomeCompleto, end1.getRua(), end1.getNumero(), end1.getBairro(), end1.getCidade(),end1.getEstado());
	}

}
