package Database;

import java.sql.*;

public class ShowSales {
    public static void showAllSales () throws SQLException {
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        Connection connection = databaseConnector.getConnection();
        PreparedStatement statement;
        Statement countStatement = connection.createStatement();
        String orderString = "SELECT OrderTable.idOrder, date, customerName, SUM(price)"+
        " FROM OrderTable" +
        " INNER JOIN Orderline" +
        " ON Orderline.idOrder = OrderTable.idOrder" +
        " GROUP BY OrderTable.idOrder, date, customerName";

        ResultSet orders = countStatement.executeQuery(orderString);
        while(orders.next()){
            //Display values
            System.out.print("ID: " + orders.getString("idOrder"));
            System.out.print(", Date: " + orders.getDate("date"));
            System.out.print(", Name: " + orders.getString("customerName"));
            System.out.println(", Total: " + orders.getString("SUM(price)"));
        }
    }
}
