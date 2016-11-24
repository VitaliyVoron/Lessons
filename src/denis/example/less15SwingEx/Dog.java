package denis.example.less15SwingEx;

public class Dog{
	String name="Barsik";
	int age=10;
	Owner owner;
	Dog(Owner owner){
		this.owner=owner;
	}
	Dog(Dog dog){
		name=dog.name;
		age=dog.age;
		owner=new Owner(dog.owner);
	}
	

}
