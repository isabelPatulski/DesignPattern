import GetOrder.*;
import Product.FinishedOrder;
import ProcessOrder.*;
import SaveOrder.SaveOrder;


public class PizziSalle {
    public static void main(String[] args) {
        Order order = GetOrderTest.getOrder();
        FinishedOrder finishedOrder = ProcessOrder.processOrder(order);
        SaveOrder.saveOrder(finishedOrder);
        //TODO fill in information for order
        System.out.print("Here is your order: " + order.name );
    }
}
