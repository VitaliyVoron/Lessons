package ua.itea.homework15ShapesGUI;

import java.sql.*;

public class Connector {

	Connection con ;
	Statement st ;

	public Connector() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/shapesdb?user=root&password=12345");
        st = con.createStatement();

	}
	
	public void addShapeToDB(Shape shape){
		try {
			st.execute("INSERT INTO shapes(name,color,square,perimetr) VALUES('" + shape.getName() + "','"
                    + shape.getColor() + "'," + shape.getSquare() + "," + shape.getPerimeter() + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getInfoAllShapes() throws SQLException {
		String shapes = "<html><table border='1'><tr><th>ID</th><th>NAME</th><th>COLOR</th><th>SQUARE</th><th>PERIMETER</th></tr>";
		ResultSet rs = st.executeQuery("SELECT * FROM shapes");
		while (rs.next()) {
            shapes += "<tr> <td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
                    + "</td><td>" + rs.getInt(4) + "</td><td>" + rs.getInt(5) + "</td></tr>";
        }
		    shapes += "</table></html>";
            rs.close();
		return shapes;
	}

	public void closeConnection() throws SQLException {
			st.close();
			con.close();
	}
}
