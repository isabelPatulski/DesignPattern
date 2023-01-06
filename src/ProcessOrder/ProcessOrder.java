package ProcessOrder;

import GetOrder.Order;
import Product.FinishedOrder;

public class ProcessOrder {
    public static FinishedOrder processOrder (Order order){
        return new FinishedOrder(order);


    }

}
