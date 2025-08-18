package JDBC;



import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.lang.ClassNotFoundException;

public class getCompleteTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String dbURL = "jdbc:mysql://localhost:3306/librarydb";
		String username = "root";
		String password = "Supraja@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		
		Statement st = con.createStatement();
		
		String selectquery = "select * from libraries;";
		
		ResultSet rs = st.executeQuery(selectquery);
		ResultSetMetaData meta = rs.getMetaData();
		
		int colCount = meta.getColumnCount();
		
		while(rs.next()) {
			for(int i =1;i<=colCount;i++) {
				String val = rs.getString(i);
				
				System.out.println(val + "\t");
			}
			System.out.println();
			
		}
	}

}

