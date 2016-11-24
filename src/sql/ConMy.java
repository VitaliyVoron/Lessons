package sql;


import java.sql.*;
public class ConMy {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:Z:/Pudge.db");
		Statement st = con.createStatement();
		//if(st.execute("CREATE TABLE users(id INT, name TEXT)")) System.out.println("Tabele created...");
		//if(st.execute("INSERT INTO users VALUES(1,'Yan'),(2,'Emma')")) System.out.println("Tabele created...");
		ResultSet rs=st.executeQuery("SELECT * FROM users");
		while(rs.next()){
			System.out.println(rs.getString(1) + "-"+rs.getString(2));
		}
		rs.close();
		st.close();
		con.close();*/
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/itea?" + "user=root&password=");
		Statement st = con.createStatement();
		//if(st.execute("CREATE TABLE users(id INT, name TEXT)")) System.out.println("Tabele created...");
		//if(st.execute("INSERT INTO users VALUES(1,'Yan'),(2,'Emma')")) System.out.println("Tabele created...");
		ResultSet rs=st.executeQuery("SELECT * FROM users");
		while(rs.next()){
			System.out.println(rs.getString(1) + "-"+rs.getString(2));
		}
		rs.close();
		st.close();
		con.close();
		
	}

}
