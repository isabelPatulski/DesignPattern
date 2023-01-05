package Pizza;

import Customer.Customer;
import GetOrder.Order;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FinishedOrder {

    public List<Product> orderLines;
    public String delegation;
    public Customer customer;


    public FinishedOrder(Order order) {
        customer = new Customer(order.name, order.phone, order.deliveryAddress, order.age);
        int delegationRandom = ThreadLocalRandom.current().nextInt(0, 4);
        switch (delegationRandom) {
            case 0:
                delegation = "Barcelona";
                break;
            case 1:
                delegation = "Girona";
                break;
            case 2:
                delegation = "Tarragona";
                break;
            case 3:
                delegation = "Lleida";
                break;

        }
    }
}
