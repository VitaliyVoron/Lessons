package ua.itea.homework14JSPShapes;

public class Triangle extends Shape {
	
	public Triangle(String color, int sideT,int height) {
		super("triangle", color);
		setSquare(sideT,height);
		setPerimeter(sideT,height);
	}

	public void setSquare(int sideT,int height) {
		square = (sideT / 2) * height;
	}

	public void setPerimeter(int sideT,int height) {

		perimeter = (int) Math.pow(sideT, 2);
	}
}
