package ua.itea.homework8;

public class Square {

	String name;
	String color;
	int square;
	int perimeter;
	
	

	public Square(String color, int side) {
		name = "square";
		this.color = color;
		calculateSquare(side);
		calculatePerimeter(side);
		
	}

	public void calculateSquare(int side) {
		square = (int) Math.pow(side, 2);
	}

	public void calculatePerimeter(int side) {
		perimeter = side * 4;
	}

	String getInfo() {
		return "Name - " + name + "; Color - " + color + "; Square - " + square + "; Perimeter - " + perimeter;
	}

}
