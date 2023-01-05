package Pizza;

import Customer.*;
import GetOrder.*;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FinishedOrder {

    public List<Product> products;
    public String delegation;
    public Customer customer;


    public FinishedOrder(Order order) {
        //Initialize customer from order
        customer = new Customer(order.name, order.phone, order.deliveryAddress, order.age);

        //Initialize random delegation
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

        //Initialize pizzas
        for (PizzaItem pizzaItem: order.pizzas) {
            CrustPizzaFactory crustPizza = new CrustPizzaFactory();
            Pizza pizza = crustPizza.getPizza(pizzaItem.crust);
            

        }

        }

    }

