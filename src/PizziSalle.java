import Database.ShowSales;
import GetOrder.*;
import Product.FinishedOrder;
import ProcessOrder.*;
import Product.Product;
import SaveOrder.SaveOrder;

import java.sql.SQLException;


public class PizziSalle {
    public static void main(String[] args) throws SQLException {

        boolean useSQL = false;
        boolean isTest = true;

        Order order;
        if (!isTest) {
            //Using the facadePattern to select input implementation (via scanner)
            order = GetOrderFacade.getOrder("input");
        }
        else {
            //Using the facadePattern to select implementation that creates a testOrder
            order = GetOrderFacade.getOrder("test");
        }
        FinishedOrder finishedOrder = ProcessOrder.processOrder(order);

        if (useSQL) {  //Could also use facadePattern for different output options.
            SaveOrder.saveOrder(finishedOrder);
            ShowSales.showAllSales();
        }

        System.out.println("");
        System.out.println("Here is your order: " + order.name);
        System.out.println("------------------------------");
        System.out.println("Delegation: " + finishedOrder.delegation);
        System.out.println("Items:");
        for (Product product: finishedOrder.products) {
            System.out.println("Name: " + product.getName() + ", price: " + product.getPrice() + ", type: " + product.type);
        }

    }
}
