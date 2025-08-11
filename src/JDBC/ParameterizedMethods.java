package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
import java.sql.ResultSet;

public class ParameterizedMethods {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String dbURL = "jdbc:mysql://localhost:3306/librarydb";
		String username = "root";
		String password = "Supraja@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection(dbURL, username, password)) {
			
			String selectquery = "SELECT * FROM libraries WHERE book_id = ? AND title = ? AND genre = ? and author = ?";
			PreparedStatement ps = con.prepareStatement(selectquery);
			ps.setInt(1, 5);
			ps.setString(2, "The Alchemist");
			ps.setString(3, "Fiction");
			ps.setString(4, "Paulo Coelho");
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("Book ID: " + rs.getInt("book_id"));
				System.out.println("Title: " + rs.getString("title"));
				System.out.println("genre: " + rs.getString("genre"));
				System.out.println("author: " + rs.getString("author"));
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

