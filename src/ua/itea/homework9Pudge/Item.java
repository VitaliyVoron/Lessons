package ua.itea.homework9Pudge;

import java.sql.SQLException;

public class Item {

	private String name;
	private int intelligence;
	private int agility;
	private int strength;

	public Item(String name) throws ClassNotFoundException, SQLException {
		this.name = name;
		fillItem(name);
		
	}
	
	void fillItem(String name) throws ClassNotFoundException, SQLException{
		WorkWithDBPudge db = new WorkWithDBPudge();
		int[] stats = db.getItemFromDB(name);
		intelligence = stats[0];
		agility = stats[1];
		strength = stats[2];
	}

	public Item(String name, int intelligence, int agility, int strength) {
		this.name = name;
		this.intelligence = intelligence;
		this.agility = agility;
		this.strength = strength;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getAgility() {
		return agility;
	}

	public int getStrength() {
		return strength;
	}

	public String getInfo() {
		String str = "Name: " + name + "; Intelligence: " + intelligence + " ; Agility: " + agility + "; Strength: "
				+ strength;
		return str;
	}

}
