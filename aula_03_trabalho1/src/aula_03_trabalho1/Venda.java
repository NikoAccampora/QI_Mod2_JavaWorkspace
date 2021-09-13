package aula_03_trabalho1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venda {
	private Produto product;
	private LocalDate saleDate;
	private Cliente client;
	private Double profit; //Tentei usar 'Float' mas deu erro no Main :\
	private Transportadora courier;

	
	public Venda(Produto product, LocalDate saleDate) {
		   this.product = product; 
		   this.saleDate = saleDate; 
	}
	
	public Venda(Produto product, LocalDate saleDate, Double profit, Cliente client) {
		   this.product = product; 
		   this.saleDate = saleDate; 
		   this.profit = profit; 
		   this.client = client; 
	}
	
    
	//GETTERS
	public Produto getProduct() {
		return product;
	}
	
	public LocalDate getSaleDate() {
		return saleDate;
	}
	
	public Cliente getClient() {
		return client;
	}
	
	public Double getProfit() {
		return profit;
	}
	
	public Transportadora getCourier() {
		return courier;
	}
	
	//SETTERS
	public void setCourier(Transportadora courier) {
		this.courier = courier;
	}
	
	public void setProfit(Double profit) {
		this.profit = profit;
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
		return String.format("Produto: %s\nVendido(a) em: %t\nCliente: %s\nLucro: %f\nTransportadora: %s",this.product.toString(),this.formatarData(this.saleDate),this.client.toString(),this.profit.toString(),this.courier.toString());
	}
}
