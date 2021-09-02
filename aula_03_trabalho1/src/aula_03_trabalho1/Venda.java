package aula_03_trabalho1;

import java.time.LocalDate;

public class Venda {
	public Produto product;
	public LocalDate saleDate;
	public Cliente client;
	public Double profit; //Tentei usar 'Float' mas deu erro no Main :\
	public Transportadora courier;
}
