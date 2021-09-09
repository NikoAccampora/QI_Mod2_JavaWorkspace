package aula_03_trabalho1;

import java.time.LocalDate;

public class Produto {
	private String name;
	private String type;
	private Double price; //Tentei usar 'Float' mas deu erro no Main :\
	private LocalDate expirationDate;
	private Vendedor vendor;
	
	public Produto(String name, String type) {
		   this.name = name; 
		   this.type = type;
		   //Creio que esses sejam os dados mais importantes.
	}
	
	public Produto(String name, String type, LocalDate expirationDate) {
		   this.name = name; 
		   this.type = type;
		   this.expirationDate = expirationDate;
		   //Data de expira��o � opcional.
	}
	
	//GETTERS
		public String getName() {
			return name;
		}
		
		public String getType() {
			return type;
		}
		
		public Double getPrice() {
			return price;
		}
		
		public LocalDate getExpirationDate() {
			return expirationDate;
		}
		
		public Vendedor getVendor() {
			return vendor;
		}
		
		//SETTERS
		public void setVendor(Vendedor vendor) {
			this.vendor = vendor;
		}
		
		public void setPrice(Double price) {
			this.price = price;
		}
		//S� isso que pode mudar, n�?
}

   
