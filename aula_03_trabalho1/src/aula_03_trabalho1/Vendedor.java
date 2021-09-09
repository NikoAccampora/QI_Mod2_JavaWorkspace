package aula_03_trabalho1;

import java.time.LocalDate;

public class Vendedor {
	private String fullName;
	private Cliente clients;
	private LocalDate hireDate;
	private Estoque inventory;
	private Fornecedor supplier;
	private Transportadora courier;
    
    
    public Vendedor(String fullName, Estoque inventory) {
		   this.fullName = fullName; 
		   this.inventory = inventory; 
	}
    
    public Vendedor(String fullName, Estoque inventory,LocalDate hireDate, Cliente clients, Fornecedor supplier, Transportadora courier) {
		   this.fullName = fullName; 
		   this.inventory = inventory; 
		   this.hireDate = hireDate; 
		   this.clients = clients; 
		   this.supplier = supplier; 
		   this.courier = courier; 
	}
    
  //GETTERS
  	public String getFullName() {
  		return fullName;
  	}
  	
  	public Cliente getClients() {
  		return clients;
  	}
  	
  	public LocalDate getHireDate() {
  		return hireDate;
  	}
  	
  	public Estoque getInventory() {
  		return inventory;
  	}
  	
  	public Fornecedor getSupplier() {
  		return supplier;
  	}
  	
  	public Transportadora getCourier() {
  		return courier;
  	}
  	
  //SETTERS
  	public void setClients(Cliente clients) {
  		this.clients = clients;
  	}
  	
  	public void setInventory(Estoque inventory) {
  		this.inventory = inventory;
  	}
  	
  	public void setSupplier(Fornecedor supplier) {
  		this.supplier = supplier;
  	}
  	
  	public void setCourier(Transportadora courier) {
  		this.courier = courier;
  	}
    
}
