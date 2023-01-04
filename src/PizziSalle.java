import GetOrder.*;
import ProcessOrder.*;


public class PizziSalle {
    public static void main(String[] args) {
        Order order = GetOrderTest.getOrder();
        ProcessOrder.processOrder(order);

        //TODO fill i information for order
        System.out.print("Here is your order: " + order.name );
    }
}
