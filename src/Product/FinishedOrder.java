package Product;

import Customer.*;
import GetOrder.*;

import java.util.ArrayList;
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
        products = new ArrayList<Product>();

        if (order.pizzas != null) {
            for (PizzaItem pizzaItem : order.pizzas) {
                ProductFactory productFactory = new ProductFactory();
                Product pizza = productFactory.getProduct(pizzaItem.name, pizzaItem.crust);
                pizza.name = pizzaItem.name;
                pizza.addIngredients(pizzaItem.toppings);
                products.add(pizza);
            }
        }
        if (order.drinks != null) {
            for (Drink drinkItem : order.drinks) {
                ProductFactory productFactory = new ProductFactory();
                Product drink = productFactory.getProduct(drinkItem.name, null);
                drink.name = drinkItem.name;
                products.add(drink);
            }
        }

    }

}

