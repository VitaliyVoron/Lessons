package ua.itea.less10;

public class Product {
	
	String name;
	String description;
	int price;
	
	public Product(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	void getInfo(){
		System.out.println("Name: "+ name+" ;Description: "+description+"; Price: "+price);
	}
	
	

}
