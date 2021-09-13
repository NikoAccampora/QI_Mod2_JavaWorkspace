package aula_03_trabalho1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
  	
  	public void setHireDate(LocalDate hireDate) {
  		this.hireDate = hireDate;
  	}
  	
////--------===Aula 10 - Trabalho toString===--------	
	private String formatarData(LocalDate data) {
		  if(data != null) {
			var formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			return formato.format(data);
		}
	    return "<!DATA INDISPONIVEL!>";	  
	}
	
	@Override
	    public String toString() {
		return String.format("Nome Completo: %s\nCliente: %s\nContratado(a) em: %t\nEstoque: %s\nFornecedor: %s\nTransportadora: %s",this.fullName,this.clients.toString(),this.formatarData(this.hireDate),this.inventory.toString(),this.supplier.toString(),this.courier.toString());
	}
    
}
