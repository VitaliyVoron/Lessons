package ua.itea.homework14JSPShapes;

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
	
	public Shape[] getAllShapes() throws SQLException {
		ResultSet rst = st.executeQuery("SELECT * FROM shapes");
		int j = 0;
		while(rst.next()){
			j++;
		}
		rst.close();
		Shape[] shapes = new Shape[j];
		ResultSet rs = st.executeQuery("SELECT * FROM shapes");
		int i = 0;
		while(rs.next()){
			shapes[i] = new Shape(rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
			i++;
		}
		rs.close();
		return shapes;
	}
	
	public void closeConnection() throws SQLException{
		st.close();
		con.close();
	}
}
