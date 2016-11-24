package ua.itea.less10;

public class Toy {

	String name;
	Dog dog;

	public Toy(String name, Dog dog) {
		this.name = name;
		this.dog = dog;
	}

	void getInfo() {
		System.out.println(" Name: " + name);
		dog.getInfo();
	}

}
