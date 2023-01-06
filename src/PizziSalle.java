import GetOrder.*;
import Product.FinishedOrder;
import ProcessOrder.*;
import Product.Product;
import SaveOrder.SaveOrder;


public class PizziSalle {
    public static void main(String[] args) {
        Order order = GetOrderTest.getOrder();
        FinishedOrder finishedOrder = ProcessOrder.processOrder(order);
        SaveOrder.saveOrder(finishedOrder);
        //TODO fill in information for order
        System.out.println("Here is your order: " + order.name);
        System.out.println("------------------------------");
        System.out.println("Delegation: " + finishedOrder.delegation);
        System.out.println("Items:");
        for (Product product: finishedOrder.products) {
            System.out.println("Name: " + product.getName() + ", price: " + product.getPrice() + ", type: " + product.type);
        }
    }
}
