package Utils;
// We will need to provide the correct URL, username, and password to connect to the database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//  The DatabaseConnection class provides a static method getConnection() that returns a Connection object to the database.

// This class uses the DriverManager class to establish a connection to the MySQL database and it hasn't been setup yet.

@SuppressWarnings("ALL")
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/pharmacy_db";
    private static final String USER = "root";
    private static final String PASSWORD = "aristocrat";

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
