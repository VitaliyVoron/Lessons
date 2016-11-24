package ua.itea.less11;

public class Car {
	String mark = "Unknow";
	String model = "Unknow";
	double engine = 0;
	int doors = 0;

	Car() {

	}

	public Car(String mark, String model) {
		this.mark = mark;
		this.model = model;
	}

	void getInfo() {
		System.out.println("Mark: " + mark + "; Model: " + model + "; Engine: " + engine + "; Doors: " + doors);
	}
}
