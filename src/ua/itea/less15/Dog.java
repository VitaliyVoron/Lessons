package ua.itea.less15;

public class Dog implements Cloneable  {
	
	String name;
	int age;
	Owner owner;
	
	
	
	public Dog(String name, int age, Owner owner) {
		this.name = name;
		this.age = age;
		this.owner = owner; 
	}

	public Dog(Dog dog) {
		name = dog.name;
		age = dog.age;
		owner = new Owner(dog.owner);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

 	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
