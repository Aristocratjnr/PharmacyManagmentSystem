package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//  The DatabaseConnection class provides a static method getConnection() that returns a Connection object to the database.

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/pharmacy_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
