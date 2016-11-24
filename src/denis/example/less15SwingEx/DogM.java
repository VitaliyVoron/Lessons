package denis.example.less15SwingEx;

public class DogM {

	public static void main(String[] args) throws CloneNotSupportedException {
		Owner owner=new Owner();
		Dog dog1=new Dog(owner);
		Dog cloneDog=new Dog(dog1);
		/*System.out.println(cloneDog.name);*/
		cloneDog.owner.name="Emma";
		System.out.println(dog1.owner.name);
		System.out.println(cloneDog.owner.name);
	}

}
