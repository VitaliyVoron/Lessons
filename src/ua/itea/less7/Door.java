package ua.itea.less7;

public class Door {
	String color = "blue";
	boolean status;

	void setColor() {
		color = "red";
	}
	
	void changeStatus(){
		status = status?false:true;
	}

	void getColor() {
		System.out.println(color);
	}
	
	void getIsOpen(){
		System.out.println(status? "open": "close");
	}
}
