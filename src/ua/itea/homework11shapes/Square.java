package ua.itea.homework11shapes;

public class Square extends Shape {

	public Square(String color, int side) {
		super("square", color);
		setSquare(side);
		setPerimeter(side);
	}

	public void setSquare(int side) {
		square = (int) Math.pow(side, 2);
	}

	public void setPerimeter(int side) {

		perimeter = (int) Math.pow(side, 2);
	}
}
