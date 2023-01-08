package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TODO beskriv SingeltonPatter
public class DatabaseConnector {
    private static DatabaseConnector connector;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/pizziSalle";
    private String username = "root";
    private String password = "12345678";

    private DatabaseConnector() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException err) {
            System.out.println("Database connection failed");
                    err.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static DatabaseConnector getInstance() throws SQLException {
        if (connector == null) {
            connector = new DatabaseConnector();
        }
        return connector;
    }
}
