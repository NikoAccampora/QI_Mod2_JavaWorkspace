package aula_03_trabalho1;

public class Cliente {
	private String name;
	public String gender;  //Que tipo de pessoa esconde o pr�pio sexo/genero?
	private String email;
	private String country; //NOTE: N�O � o pa�s de origem.

	public Cliente(String name, String country) {
		   this.name = name; 
		   this.country = country;  //Requer pa�s de localiza��o em caso de exporta��es.
	   }
//GETTERS
public String getName() {
	return name;
}

public String getEmail() {
	return email;
}

public String getCountry() {
	return country;
} 

//SETTERS
public void setEmail(String email) {
	this.email = email;
}

public void setGender(String gender) {
	this.gender = gender;  //Pq hoje em dia tem isso �\(-_-)/�
}

public void setCountry(String country) {
	this.country = country;  //A pessoa pode viajar.
}

////--------===Aula 10 - Trabalho toString===--------
@Override
public String toString() {
	return String.format("Name: %s\nSex: %s\nE-Mail: %s\nCountry of residence: %s", this.name,this.gender,this.email,this.country);
}

}