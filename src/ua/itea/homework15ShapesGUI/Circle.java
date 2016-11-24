package ua.itea.homework15ShapesGUI;

public class Circle extends Shape {

	public Circle(String color, int radius) {
		super("circle", color);
		setSquare(radius);
		setPerimeter(radius);
	}
	
	public void setSquare(int radius){
		square = (int)(Math.PI) * (int) Math.pow(radius, 2);
	}
	
	public void setPerimeter(int radius){
		
		perimeter = (int) (2 * Math.PI * radius);
	}
}
