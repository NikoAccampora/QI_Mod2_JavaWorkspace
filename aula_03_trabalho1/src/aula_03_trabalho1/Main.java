package aula_03_trabalho1;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		//OBJECTS
		Cliente client1 = new Cliente();
		Estoque inv1 = new Estoque();
		Fornecedor supplier1 = new Fornecedor();
		Produto product1 = new Produto();
		Transportadora courier1 = new Transportadora();
		Venda sale1 = new Venda();
		Vendedor vendor1 = new Vendedor();
		
		//client1 
		client1.name = "Caroline Becker";
		client1.gender = "Female";
		client1.email = "carolbeck@gmail.com";
		client1.country = "Germany";
		
		//inv1
		inv1.type = "Electronics";
		inv1.quantity = 379;
		inv1.vendor = vendor1;
		inv1.supplier = supplier1; 
		
		//supplier1
		supplier1.name = "AliExpress";
		supplier1.country = "China";
		supplier1.courier = courier1;
		
		//product1
		product1.name = "Xiaomi Redmi9C";
		product1.type = "Electronics";
		product1.price = 1183.49; //Tentei usar 'float' mas deu erro :\
		product1.expirationDate = LocalDate.of(2059, 12, 31);
		product1.vendor = vendor1;
		
		//courier1
		courier1.name = "FedEx";
		courier1.inventory = inv1;
		courier1.country = "USA";
		courier1.supplier = supplier1;
		
		//sale1
		sale1.product = product1;
		sale1.saleDate = LocalDate.of(2020, 5, 14);
		sale1.client = client1;
		sale1.profit = 1183.49;
		sale1.courier = courier1;
		
		//vendor1
		vendor1.fullName = "Albert McMillian";
		vendor1.clients = client1;
		vendor1.hireDate = LocalDate.of(2016, 3, 8);
		vendor1.inventory = inv1;
		vendor1.supplier = supplier1;
		vendor1.courier = courier1;
	}

}