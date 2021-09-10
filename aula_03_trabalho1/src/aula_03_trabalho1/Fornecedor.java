package aula_03_trabalho1;

public class Fornecedor {
	private String name;
	private String country;
	private Transportadora courier;
	
	public Fornecedor(String name, String country) {
		   this.name = name; 
		   this.country = country;
		   //Creio que esses sejam os dados mais importantes.
	}
	
	public Fornecedor(String name, String country, Transportadora courier) {
		   this.name = name; 
		   this.country = country;
		   this.courier = courier;
		   //A transportadora se torna opcional.
	}
}
