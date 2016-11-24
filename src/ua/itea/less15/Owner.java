package ua.itea.less15;

public class Owner {
	
	String name;
	
	
	public Owner() {
	}
	
	public Owner(String name) {
		super();
		this.name = name;
	}



	public Owner(Owner owner) {
		name = owner.name;
	}
	
	

}
