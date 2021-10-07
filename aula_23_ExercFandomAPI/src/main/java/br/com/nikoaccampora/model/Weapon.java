package br.com.nikoaccampora.model;

public class Weapon {
	
	public String name;
	public Element element;
	public RobotMaster user;
	public RobotMaster strongAgainst;
	
	public enum Element {
		Fire,Ice,Water,Electric,Earth,Energy,Metal,Explosive,Temporal,Other
	}
}
