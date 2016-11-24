package ua.itea.homework8;

public class Triangle {

	String name;
	String color;
	int square;
	int perimeter;
	
	

	public Triangle(String color, int side, int height) {
		name = "triangle";
		this.color = color;
		colculateSquare(side,height);
		colculatePerimeter(side);
		
	}

	public void colculateSquare(int side, int height) {
		this.square = (side / 2) * height;
	}

	public void colculatePerimeter(int side) {
		this.perimeter = side * 3;
	}

	String getInfo() {
		return "Name - " + name + "; Color - " + color + "; Square - " + square + "; Perimeter - " + perimeter;
	}

}
