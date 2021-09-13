package aula_03_trabalho1;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		//OBJECTS
		Fornecedor supplier2 = new Fornecedor("CJ Dropshipping", "England");
		
		Cliente client1 = new Cliente("Caroline Becker","Germany");
		
		Estoque inv1 = new Estoque(supplier2, "Electronics");
		
		Fornecedor supplier1 = new Fornecedor("AliExpress", "China");
		
		Produto product1 = new Produto("Xiaomi Redmi9C", "Electronics", LocalDate.of(2059, 12, 31));
		
		Transportadora courier1 = new Transportadora("FedEx", "USA");
		
		Venda sale1 = new Venda(product1, LocalDate.of(2020, 5, 14), 1183.49, client1);
		
		Vendedor vendor1 = new Vendedor("Albert McMillian", inv1);
		
		//client1 
		client1.setEmail("cbecker@gmail.com");
		client1.gender = "Female";
		
		//inv1
		inv1.setQuantity(379);
		inv1.setVendor(vendor1);
		
		//supplier1
	    supplier1.setCourier(courier1);
	    
	    //supplier2
	    supplier2.setCourier(courier1);
		
		//product1
		product1.setPrice(1183.49); //Tentei usar 'float' mas deu erro :\
		product1.setVendor(vendor1);
		
		//courier1
		courier1.setInventory(inv1);
		courier1.setSupplier(supplier1);
		
		//sale1
		sale1.setCourier(courier1);
		
		//vendor1
		vendor1.setClients(client1);
		vendor1.setHireDate(LocalDate.of(1998,3,16));
		vendor1.setSupplier(supplier1);
		vendor1.setCourier(courier1);
	
////--------===Aula 10 - Trabalho toString===--------	
//(Baseado em aula_02_hospital)
		
    System.out.println(inv1.toString());

//SÓ FUNCIONOU COM 'Cliente'; NAS OUTRAS CLASSES DÁ ERRO DE EXECUÇÃO :(
	}

}