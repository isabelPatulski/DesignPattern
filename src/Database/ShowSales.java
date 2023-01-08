package Database;

import java.sql.*;

public class ShowSales {
    public static void showAllSales () throws SQLException {
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        Connection connection = databaseConnector.getConnection();
        PreparedStatement statement;
        Statement countStatement = connection.createStatement();
        String idStr = "SELECT date, customerName, CustomerPhone FROM OrderTable ";
        ResultSet orders = countStatement.executeQuery(idStr);
        while(orders.next()){
            //Display values
            System.out.print("Date: " + orders.getDate("date"));
            System.out.print(", Name: " + orders.getString("customerName"));
            System.out.print(", Phone: " + orders.getString("customerPhone"));
            //System.out.println(", Total: " + orders.getString("last"));
            System.out.println();
        }
    }
}
