package aula_02_hospital;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// Criando um objeto
		Endereco end1 = new Endereco();
		Paciente pac1 = new Paciente();
		
		//Popular os dados
		end1.bairro = "Centro";
		end1.cep = "0000";
		end1.cidade = "Porto Alegre";
		end1.estado = "RS";
		end1.numero = "12-A";
		end1.rua = "Travessa não te interessa";
		
		pac1.cpf = "000";
		pac1.nomeCompleto = "João Paulo Nogueiro";
		pac1.rg = "9999";
		pac1.telefone = "99999";
		pac1.endereco = end1;
		
		// Imprimir dados
		System.out.printf("O senhor %s reside no endereço %s\n nº %s,no bairro %s - %s/%s",
				pac1.nomeCompleto, end1.rua, end1.numero, end1.bairro, end1.cidade,end1.estado);
	}

}
