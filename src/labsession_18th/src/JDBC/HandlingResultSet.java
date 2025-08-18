package JDBC;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.lang.ClassNotFoundException;


public class HandlingResultSet {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String dbURL = "jdbc:mysql://localhost:3306/librarydb";
		String username = "root";
		String password = "Supraja@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con1 = DriverManager.getConnection(dbURL, username, password);
		
		
		Statement st = con1.createStatement();
		
		String selectquery = "select * from libraries;";
		
		ResultSet rs = st.executeQuery(selectquery);
		
		
		while (rs.next()) {
			//int id1 = rs.getInt("book_id");
			//System.out.println(id1);
			
			//String s1 = rs.getString("title");
			//System.out.println(s1);
			
			//column indexing 
			
			
			System.out.println(rs.getString(3));
			
			
			System.out.println(rs.getBoolean(6));
			
			int id4 = rs.getInt(1);
			System.out.println(id4);
			
			
			
			
		}

	}
}


