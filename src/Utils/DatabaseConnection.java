//Daniella Commits
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
<<<<<<< HEAD

//  The DatabaseConnection class provides a static method getConnection() that returns a Connection object to the database.
=======
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;
>>>>>>> 14ad8a7aaeff805d1bf821dda10177358df77836

public class DatabaseConnection {
    private static final Logger LOGGER = Logger.getLogger(DatabaseConnection.class.getName());
    private static BasicDataSource dataSource;
    
    // Load database configuration from a properties file
    static {
        try (InputStream input = DatabaseConnection.class.getClassLoader().getResourceAsStream("db.properties")) {
            Properties properties = new Properties();
            if (input == null) {
                LOGGER.log(Level.SEVERE, "Sorry, unable to find db.properties");
                return;
            }
            properties.load(input);
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");
            
            // Initialize the connection pool
            dataSource = new BasicDataSource();
            dataSource.setUrl(url);
            dataSource.setUsername(user);
            dataSource.setPassword(password);
            dataSource.setMinIdle(5);
            dataSource.setMaxIdle(10);
            dataSource.setMaxOpenPreparedStatements(100);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Error loading database configuration", ex);
        }
    }

    // Private constructor to prevent instantiation
    private DatabaseConnection() {}

    // Get a connection from the connection pool
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error getting database connection", e);
        }
        return connection;
    }
}
