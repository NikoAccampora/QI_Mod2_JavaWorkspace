package br.com.nikoaccampora.model;

public class Character {
	
	public String name;
	public Type type;
	public String gameDebut;
	
public Character(String name, Type type, String gameDebut) {
		
		this.name = name;
		this.type = type;
		this.gameDebut = gameDebut;	
	}
public enum Type {Human, Robot}

}
