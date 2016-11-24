package ua.itea.homework8;

public class Circle {

	String name;
	String color;
	int square;
	int perimeter;
	
	

	public Circle(String color, int radius) {
		name = "circle";
		this.color = color;
		calculateSquare(radius);
		calculatePerimeter(radius);
	}

	public void calculateSquare(int radius) {
		square = (int) ((Math.PI) * ((int) Math.pow(radius, 2)));
	}

	public void calculatePerimeter(int radius) {
		perimeter = (int) (2 * Math.PI * radius);
	}

	String getInfo() {
		return "Name - " + name + "; Color - " + color + "; Square - " + square + "; Perimeter - " + perimeter;
	}

}
