package ua.itea.less11;

public class Skoda extends Car {
	String fogHeadLights = "Xeon";

	Skoda(String mark, String model) {
		super(mark, model);
	}

	Skoda() {
		mark = "Skoda";
		model = "SuperB";
		engine = 1.9;
		doors = 4;
	}

	@Override
	void getInfo() {
		System.out.println("Mark: " + mark + "; Model: " + model + "; Engine: " + engine + "; Doors: " + doors
				+ "; Ext:" + fogHeadLights);
	}
}
