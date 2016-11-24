package ua.itea.homework15ShapesGUI;

import java.sql.*;

public class ShapeFactoryMain  {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connector connect = new Connector();
		ControllerShapes con = new ControllerShapes(connect);
		Color color = new Color();
		GUI gui = new GUI(color,con);

		//System.out.println(con.getInfoAllShapes());
		//new GUI(new Color());
	}
}
