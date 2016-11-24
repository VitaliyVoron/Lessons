package ua.itea.less8;

public class Main {

	public static void main(String[] args) {
		/*PowerSupply power = new PowerSupply();
		power.setOn(230);
		power.setInputV(260);
		power.getInfo();*/
		
		/*Lamp lamp = new Lamp();
		lamp.setON();
		lamp.setBrightness(60);
		lamp.setDimON();
		System.out.println(lamp.getInfo());*/
		

		Car car = new Car();
		Color color = new Color();
		car.setColor(color.getColor());
		System.out.println(car.getInfo());
	}

}
