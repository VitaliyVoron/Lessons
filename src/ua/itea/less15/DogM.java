package ua.itea.less15;

public class DogM {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Barsik", 45, new Owner("Petya"));
		Dog dog2 = new Dog(dog1);
		
		System.out.println(dog2.name);
		System.out.println(dog2.owner.name);

	}

}
