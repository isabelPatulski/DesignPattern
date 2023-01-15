package Product;

import Customer.*;
import GetOrder.*;
import java.util.ArrayList;
import java.util.List;

//FactoryDesign pattern used
public class FinishedOrder {

    public List<Product> products;
    public String delegation;
    public Customer customer;


    public FinishedOrder(Order order) {
        //Initialize customer from order
        customer = new Customer(order.name, order.phone, order.deliveryAddress, order.age);

        delegation = order.delegation;

        //Get pizzas from order
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
        //Get drinks from order
        if (order.drinks != null) {
            for (String drinkItem : order.drinks) {
                ProductFactory productFactory = new ProductFactory();
                Product drink = productFactory.getProduct(drinkItem.toLowerCase(), null);
                if (drink != null) {
                    drink.name = drinkItem.toLowerCase();
                    products.add(drink);
                }
            }
        }

    }

}

