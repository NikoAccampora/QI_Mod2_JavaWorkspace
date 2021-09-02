package aula_03_trabalho1;

import java.time.LocalDate;

public class Produto {
	public String name;
	public String type;
	public Double price; //Tentei usar 'Float' mas deu erro no Main :\
	public LocalDate expirationDate;
	public Vendedor vendor;
}
