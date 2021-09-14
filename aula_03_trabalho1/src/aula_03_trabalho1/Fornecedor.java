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
	
	//GETTERS
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public Transportadora getCourier() {
		return courier;
	}
	
	//SETTERS
	public void setCourier(Transportadora courier) {
		this.courier = courier;
	}
	//Caso queiram utilizar uma transportadora diferente.
////--------===Aula 10 - Trabalho toString===--------	
@Override
public String toString() {
	return String.format("Name: %s\nCountry: %s\nCourier: %s",this.name,this.country,this.courier.getName().toString());
}
}
