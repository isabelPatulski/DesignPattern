package ProcessOrder;

import Customer.*;
import GetOrder.Order;
import Pizza.FinishedOrder;

public class ProcessOrder {
    public static FinishedOrder processOrder (Order order){
        FinishedOrder finishedOrder = new FinishedOrder();
        finishedOrder.customer = new Customer(order.name, order.phone, order.deliveryAddress, order.age);
        return finishedOrder;

    }

}
