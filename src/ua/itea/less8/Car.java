package ua.itea.less8;

public class Car {
	
	String mark;
	String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	String getInfo(){
		return "Mark "+mark+"Color "+color;
	}
}
