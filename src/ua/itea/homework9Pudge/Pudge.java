package ua.itea.homework9Pudge;

public class Pudge {

	private int intelligence;
	private int agility;
	private int strength;

	private Item[] items = new Item[2];

	private int health;
	private int strike;

	Pudge() {
		intelligence = 20;
		agility = 20;
		strength = 20;
		health = 100;
		calculateStrike();
	}

	Pudge(int intelligence, int agility, int strength) {
		this.intelligence = intelligence;
		this.agility = agility;
		this.strength = strength;
		health = 100;
		calculateStrike();
	}

	public void addItem(Item item) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				intelligence += item.getIntelligence();
				agility += item.getAgility();
				strength += item.getStrength();
				calculateStrike();
				break;
			} else {
				System.out.println("Itams is full");
			}
		}
	}

	public Item giveItem(int index) {
		if (items[index] != null) {
			Item temp = items[index];
			intelligence -= items[index].getIntelligence();
			agility -= items[index].getAgility();
			strength -= items[index].getStrength();
			items[index] = null;
			calculateStrike();
			return temp;
		} else {
			return null;
		}
	}

	public void removeItem(int index) {
		if (items[index] != null) {
			intelligence -= items[index].getIntelligence();
			agility -= items[index].getAgility();
			strength -= items[index].getStrength();
			items[index] = null;
			calculateStrike();
		} else {
			System.out.println("This item empty");
		}
	}

	public void tookStrike(int strike) {
		if (strike > health) {
			health = 0;
		} else {
			health -= strike;
		}
	}

	void calculateStrike() {
		strike = (intelligence / 3) + (agility / 2) + strength;
	}

	public int getStrike() {
		return strike;
	}

	public int getHealth() {
		return health;
	}

	String getInfo() {
		String str = "health - " + health + " strike - " + strike;
		for (int i = 0; i < items.length; i++) {
			str += "\nItem " + i + ": " + (items[i] != null ? items[i].getName() : null) + ";";
		}
		return str;
	}

}
