package ua.itea.less10;

public class Dog {

	String name;
	String breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	void getInfo() {
		System.out.println("Name: " + name + "\nDreed: " + breed);
	}

}
