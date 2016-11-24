package ua.itea.less9;

public class Car {
	
	String mark;
	String model;
	double engine;
	String color;
	
	Car(String mark,String model,double engine,String color){
		this.mark = mark;
		this.model=model;
		this.engine=engine;
		this.color=color;
		getInfo();
	}
	
	void getInfo(){
		System.out.println("Mark: "+mark+" Model: "+model+" Engine "+engine+" Color "+color);
	}

}
