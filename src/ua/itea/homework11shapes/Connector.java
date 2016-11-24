package ua.itea.homework11shapes;

import java.sql.*;

public class Connector {
	
	Connection con = null;
	Statement st = null;

	public Connector() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/shapesdb?" + "user=root&password=");
		st = con.createStatement();
	}

	public void addShapeToDB(Shape shape) throws SQLException {
		st.execute("INSERT INTO shapes(name,color,square,perimetr) VALUES('" + shape.getName() + "','" + shape.getColor() + "',"
				+ shape.getSquare() + "," + shape.getPerimeter() + ")");
	}

	public String getInfoAllShapes() throws SQLException {
		ResultSet rs = st.executeQuery("SELECT * FROM shapes");
		String shapes = "";
		while(rs.next()){
			shapes += rs.getString(1)+") Name: "+rs.getString(2)+", Color: "+rs.getString(3)+", Square: "+rs.getInt(4)+", Perimetr: "+rs.getInt(5)+"<br/>";
		}
		rs.close();
		return shapes;
	}
	
	public void closeConnection() throws SQLException{
		st.close();
		con.close();
	}
}
