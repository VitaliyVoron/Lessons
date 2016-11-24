package ua.itea.less10;

public class MainToy {

	public static void main(String[] args) {
		Dog dog = new Dog("Djek", "mobs");
		Toy toy = new Toy("Pups", dog);

		toy.getInfo();
	}

}
