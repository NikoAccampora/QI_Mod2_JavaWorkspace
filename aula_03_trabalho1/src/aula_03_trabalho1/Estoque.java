package aula_03_trabalho1;

public class Estoque {
	private String type;
	private int quantity;
	private Vendedor vendor;
	private Fornecedor supplier; 
	

public Estoque(Fornecedor supplier, String type) {
	   this.supplier = supplier; 
	   this.type = type;
	   //Creio que esses sejam os dados mais importantes.
}

//GETTERS
public String getType() {
	return type;
}

public int getQuantity() {
	return quantity;
}

public Vendedor getVendor() {
	return vendor;
}

public Fornecedor getSupplier() {
	return supplier;
}

//SETTERS
public void setVendor(Vendedor vendor) {
	this.vendor = vendor;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
//Não se muda o tipo de estoque ou fornecedor.

////--------===Aula 10 - Trabalho toString===--------	
@Override
public String toString() {
	return String.format("Inventory type: %s\nQuantity: %s\nDesignated vendor: %s\nSupplier: %s",this.type,this.quantity,this.vendor.getFullName().toString(),this.supplier.getName().toString());
}
}