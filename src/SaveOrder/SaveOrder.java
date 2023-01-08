package SaveOrder;


import Database.DatabaseConnector;
import Product.FinishedOrder;
import Product.Product;

import java.sql.*;

public class SaveOrder {
    public static void saveOrder (FinishedOrder finishedOrder) throws SQLException {
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        Connection connection = databaseConnector.getConnection();
        PreparedStatement statement;
        Statement countStatement = connection.createStatement();
        String idStr = "SELECT COUNT(*) FROM OrderTable ";
        ResultSet countResult = countStatement.executeQuery(idStr);
        countResult.next();
        int orderId = countResult.getInt(1)+1;

        String sqlString ="INSERT INTO OrderTable (idOrder, date, customerName, customerAddress, customerPhone, delegation )";
        sqlString += "VALUES (?, ?, ?, ?, ?, ?)";
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        try {
            statement = connection.prepareStatement(sqlString);
            statement.setInt(1, orderId);
            statement.setDate(2, date);
            statement.setString(3, finishedOrder.customer.name);
            statement.setString(4, finishedOrder.customer.address);
            statement.setString(5, finishedOrder.customer.phone);
            statement.setString(6, finishedOrder.delegation);

            statement.execute();

            sqlString ="INSERT INTO OrderLine (idOrder, type, name, price)";
            sqlString += "VALUES (?, ?, ?, ?)";
            statement = connection.prepareStatement(sqlString);
            for (Product product: finishedOrder.products) {
                statement.setInt(1, orderId);
                statement.setString(2, product.type);
                statement.setString(3, product.getName());
                statement.setDouble(4, product.getPrice());

                statement.addBatch();
            }
            statement.executeBatch();

        } catch (SQLException err) {
            System.out.println("Error saving order");

        }



    }
}
