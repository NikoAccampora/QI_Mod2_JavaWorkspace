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
//Não se muda o tipo de estoque ou fornecedor
}