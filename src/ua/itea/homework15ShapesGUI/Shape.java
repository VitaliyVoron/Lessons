 package ua.itea.homework15ShapesGUI;

public class Shape {

	private String name;
	private String color;
	protected int square;
	protected int perimeter;

	public Shape() {
	}

	public Shape(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Shape(String name, String color, int square, int perimeter) {
		this.name = name;
		this.color = color;
		this.square = square;
		this.perimeter = perimeter;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getSquare() {
		return square;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public String getInfo() {
		return "Name - " + name + "; Color - " + color + "; Square - " + square + "; Perimeter - " + perimeter;
	}
}
