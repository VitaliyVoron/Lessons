package ua.itea.homework11shapes;

import java.sql.*;
import java.util.Scanner;

public class ShapeFactoryMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connector db = new Connector();
		
		Scanner scan = new Scanner(System.in);
		Color color = new Color();
		View view = new View();
		new ControllerShapes(scan, db, color, view);
		
		scan.close();
	}

}
