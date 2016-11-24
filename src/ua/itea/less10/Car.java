package ua.itea.less10;

public class Car {
	
	String model;
	String mark;
	Owner owner;
	
	Car(String model,String mark,Owner owner){
		this.mark = mark;
		this.model = model;
		this.owner = owner;
	}
	
	void getInfo(){
		System.out.println("Mark: "+mark+" Model: "+model);
		owner.getName();
	}

}
