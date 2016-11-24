package ua.itea.homework14JSPShapes;

import java.sql.*;

public class ShapeFactoryMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connector con = new Connector();
		System.out.println(con.getInfoAllShapes());
		
		Shape[] shapes = con.getAllShapes();
		for(int i = 0;i < shapes.length;i++){
			Shape shape = shapes[i];
			System.out.println("<b style='color:"+shape.getColor()+"'>"+shape.getName()+"; "+shape.getColor()+"</b>");
		}
		//System.out.println(shapes[1].getName());
		
		//Scanner scan = new Scanner(System.in);
		//Color color = new Color();
		//View view = new View();
		//new ControllerShapes(scan, db, color, view);
		
		//scan.close();
	}

}
