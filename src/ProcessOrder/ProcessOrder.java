package ProcessOrder;

import Customer.*;
import GetOrder.Order;
import Pizza.FinishedOrder;

public class ProcessOrder {
    public static FinishedOrder processOrder (Order order){
        return new FinishedOrder(order);


    }

}
