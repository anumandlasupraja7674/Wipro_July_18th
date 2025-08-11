package JDBC;

import java.sql.*;

public class PreparedStatementEx {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/storeddb"; // Change DB name
        String username = "root"; // Your DB username
        String password = "Supraja@123"; // Your DB password

        try {
            // 1. Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to Database
            Connection conn = DriverManager.getConnection(url, username, password);

            // 3. Create Table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Products (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(50)," +
                    "price DOUBLE)";
            PreparedStatement createStmt = conn.prepareStatement(createTableSQL);
            createStmt.executeUpdate();
           

            // 4. Insert Data
            String insertSQL = "INSERT INTO Products (name, price) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setString(1, "Laptop");
            insertStmt.setDouble(2, 55000.50);
            insertStmt.executeUpdate();

            insertStmt.setString(1, "Smartphone");
            insertStmt.setDouble(2, 20000.00);
            insertStmt.executeUpdate();

           

            // 5. Update Data
            String updateSQL = "UPDATE Products SET price = ? WHERE name = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
            updateStmt.setDouble(1, 58000.00);
            updateStmt.setString(2, "Laptop");
            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);

            // 6. Read Data
            String selectSQL = "SELECT * FROM Products";
            PreparedStatement selectStmt = conn.prepareStatement(selectSQL);
            ResultSet rs = selectStmt.executeQuery();
            System.out.println("Products List:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                                   rs.getString("name") + " | " +
                                   rs.getDouble("price"));
            }

            // 7. Delete Data
            String deleteSQL = "DELETE FROM Products WHERE name = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
            deleteStmt.setString(1, "Smartphone");
            int rowsDeleted = deleteStmt.executeUpdate();
            System.out.println(" Rows deleted: " + rowsDeleted);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

