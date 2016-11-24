package ua.itea.homework15ShapesGUI;

import java.util.ArrayList;

public class ArrayMemory {
	
	private ArrayList<Shape> shapes;

	public ArrayMemory() {
		shapes = new ArrayList<>();
	}
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	public void clearArray(){
		shapes.clear();
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public String getInfoAllShapes() {
		String infoShapes = "<html><table border='1'><tr><th>ID</th><th>NAME</th><th>COLOR</th><th>SQUARE</th><th>PERIMETER</th></tr>";
		int count = 0;
		for(Shape s: shapes){
			infoShapes+= "<tr> <td>" + ++count + "</td><td>" + s.getName() + "</td><td>" + s.getColor()
			+ "</td><td>" + s.getSquare() + "</td><td>" + s.getPerimeter() + "</td></tr>";
		}
		return infoShapes;
	}

}
