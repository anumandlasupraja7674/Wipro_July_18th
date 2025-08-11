package JDBC;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.lang.ClassNotFoundException;

public class MysqlConnector {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String dbURL = "jdbc:mysql://localhost:3306/userdb";
		String username = "root";
		String password = "Supraja@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		
		Statement st = con.createStatement();
		
		String selectquery = "select * from users;";
		
		ResultSet rs = st.executeQuery(selectquery);
		
		
		
		while (rs.next()) {
			System.out.println(rs.getString("uid"));
			
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getString("upassword"));
		}

	}

}
