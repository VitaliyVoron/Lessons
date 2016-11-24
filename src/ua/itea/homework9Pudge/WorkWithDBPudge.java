package ua.itea.homework9Pudge;

import java.sql.*;

public class WorkWithDBPudge {

	Connection con = null;
	Statement st = null;

	public WorkWithDBPudge() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/pudge?" + "user=root&password=");
		st = con.createStatement();

	}

	public void addItemToDB(Item item) throws SQLException {
		st.execute("INSERT INTO items(name,intelligence,agility,strength) VALUES('" + item.getName() + "','"
				+ item.getIntelligence() + "'," + item.getAgility() + "," + item.getStrength() + ")");
	}

	public int[] getItemFromDB(String name) throws SQLException {
		int[] res = new int[3];
		ResultSet rs = st.executeQuery("SELECT * FROM items WHERE name ='" + name + "'");
		while (rs.next()) {
			res[0] = rs.getInt(3);
			res[1] = rs.getInt(4);
			res[2] = rs.getInt(5);
		}
		rs.close();
		return res;
	}

	public String showAllItemsFromDB() throws SQLException {
		ResultSet rs = st.executeQuery("SELECT * FROM items");
		String items = "";
		while (rs.next()) {
			items += rs.getString(1) + ") Name: " + rs.getString(2) + ", Intelligence: " + rs.getInt(3) + ", Agility: "
					+ rs.getInt(4) + ", Strength: " + rs.getInt(5) + "\n";
		}
		rs.close();
		return items;
	}

	void closeCon() throws SQLException {
		st.close();
		con.close();
	}

}
