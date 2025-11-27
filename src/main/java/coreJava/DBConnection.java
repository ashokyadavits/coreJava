package coreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static volatile DBConnection instance;
    private static Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/codecommerce";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Private constructor to prevent object creation
    private DBConnection() {
        try {
            // Optional for new JDBC versions
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Public method to return the singleton instance
    public static DBConnection getInstance() {
        if (instance == null) {  // First check (no locking)
            synchronized (DBConnection.class) {
                if (instance == null) { // Second check (thread-safe)
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }

    // Return the same connection every time
    public Connection getConnection() {
        return connection;
    }
}

 class TestDB {
    public static void main(String[] args) {
        Connection con = DBConnection.getInstance().getConnection();
        System.out.println("DB Connected: " + (con != null));
    }
}