package GetOrder;

import Product.Drink;
import Product.Product;
import Product.ProductFactory;

import java.util.ArrayList;

public class GetOrderTest {
    public static Order getOrder(){
        Order order = new Order();
        order.name = "Flemming";
        order.phone = "28942300";
        order.deliveryAddress = "Hvedevangen 13";
        order.firstOrder = true;
        order.age = 42;

        order.pizzas = new ArrayList<PizzaItem>();
        PizzaItem pizzaItem1 = new PizzaItem();
        pizzaItem1.name = "texas";
        pizzaItem1.crust = "original";
        order.pizzas.add(pizzaItem1);

        PizzaItem pizzaItem2 = new PizzaItem();
        pizzaItem2.name = "pepperoni";
        pizzaItem2.crust = "thin";
        order.pizzas.add(pizzaItem2);


        PizzaItem pizzaItem3 = new PizzaItem();
        pizzaItem3.name = "margherita";
        pizzaItem3.crust = "sicilian";
        pizzaItem3.toppings = new ArrayList<String>();
        pizzaItem3.toppings.add("tomatoslices");
        pizzaItem3.toppings.add("mushrooms");
        pizzaItem3.toppings.add("ham");
        order.pizzas.add(pizzaItem3);

        return order;

    }
}
