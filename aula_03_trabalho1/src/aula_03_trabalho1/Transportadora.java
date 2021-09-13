package aula_03_trabalho1;


public class Transportadora {
	private String name;
	private Estoque inventory;
	private String country;
	private Fornecedor supplier;
	
	
	public Transportadora(String name) {
		   this.name = name; 
	}
	
	public Transportadora(String name, String country) {
		   this.name = name; 
		   this.country = country; 
		   //País é opcional.
	}
	
	
	        //GETTERS
			public String getName() {
				return name;
			}
			
			public Estoque getInventory() {
				return inventory;
			}
			
			public String getCountry() {
				return country;
			}
			
			public Fornecedor getSupplier() {
				return supplier;
			}
			
			//SETTERS
			public void setInventory(Estoque inventory) {
				this.inventory = inventory;
			}
			
			public void setSupplier(Fornecedor supplier) {
				this.supplier = supplier;
			}
	
////--------===Aula 10 - Trabalho toString===--------	
           	@Override
			public String toString() {
				return String.format("Nome: %s\nEstoque: %s\nPaís: %s\nFornecedor: %s",this.name,this.inventory.toString(),this.country,this.supplier.toString());
			}
}
