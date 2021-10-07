package br.com.nikoaccampora.model;

public class RobotMaster {
	
	public String name;
	public String gameDebut;
	public String serialNumber;
	public String creator;
	public String weapon;
	public String weakness;
	
public RobotMaster(String name, String gameDebut, String serialNumber, String creator, String weapon, String weakness) {
		
		this.name = name;
		this.gameDebut = gameDebut;
		this.serialNumber = serialNumber;
		this.creator = creator;
		this.weapon = weapon;
		this.weakness = weakness;
	}

}
