package GetOrder;
import Customer.Customer;
import Product.Ingredient;
import Product.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Limited errorHandling

public class GetOrder {
    public static Order getOrder(){
        Order order = new Order();
        Scanner input = new Scanner(System.in);
        order.delegation = Pizza.getRandomDelegation();

        System.out.println("WELCOME TO PIZZISALLE IN " + order.delegation.toUpperCase());
        System.out.println("-------------------------------------------");
        System.out.println("");

        System.out.print("Name: ");
        order.name = input.nextLine();

        System.out.print("Phone: ");
        order.phone = input.nextLine();

        System.out.print("Address: ");
        order.deliveryAddress = input.nextLine();

        System.out.print("First order?: ");
        order.firstOrder = Boolean.parseBoolean(input.nextLine());

        System.out.print("Age: ");
        order.age = Integer.parseInt(input.nextLine());

        System.out.println("What kind of pizzas would you like? Enter blank when done ordering Pizzas");
        int pizzasOrdered = 0;
        String pizzaName = "";
        String extraTopping = "";
        order.pizzas = new ArrayList<PizzaItem>();
        order.drinks = new ArrayList<String>();
        String extraDrinks = "";
        boolean isOK = false;


        do {
            do {
                System.out.print(("Enter pizza " + (pizzasOrdered + 1) + ": "));
                pizzaName = input.nextLine().toLowerCase();
                isOK = (Pizza.isPizzaNameValid(pizzaName) && (Pizza.isPizzaDelegationValid(order.delegation, pizzaName)));
                if (!isOK) {
                    System.out.println(pizzaName + " is not a pizza with have. Try again");
                }
            } while ((!isOK) && ((pizzaName != null) && (!pizzaName.isBlank())));

            if ((pizzaName != null) && (!pizzaName.isBlank())) {
                PizzaItem pizzaItem = new PizzaItem();
                Drink drink = new Drink();
                pizzaItem.name = pizzaName;
                do {
                    System.out.print("What kind of crust? Enter blank if you want Default ");
                    pizzaItem.crust = input.nextLine().toLowerCase();
                    isOK = ((pizzaItem.crust == null) || (pizzaItem.crust.isBlank()))
                            || (Crust.isCrustValid(pizzaItem.crust));
                    if (!isOK) {
                        System.out.println(pizzaItem.crust + " is not a crust with have. Select another");
                    }
                } while (!isOK);

                if ((pizzaItem.crust == null) || (pizzaItem.crust.isBlank())) {
                    pizzaItem.crust = Crust.defaultCrust();
                }

                pizzaItem.toppings = new ArrayList<String>();
                int toppings = 0;

                do {
                    System.out.print("Add extra topping " + (toppings + 1) + ", Enter blank when done: ");
                    extraTopping = input.nextLine().toLowerCase();
                    isOK = ((extraTopping == null) || (extraTopping.isBlank()))
                            || (Ingredient.isIngredientValid(extraTopping));
                    if (!isOK) {
                        System.out.println(pizzaItem.crust + " " +
                                "is not an ingredient with have. Select another or press enter");
                    } else {
                        pizzaItem.toppings.add(extraTopping);
                        toppings++;
                    }
                } while ((toppings < 10) && ((extraTopping != null) && (!extraTopping.isBlank()))) ;

                order.pizzas.add(pizzaItem);
                System.out.println(" "); //Creates an empty line between each pizza
                pizzasOrdered++;
            }

        } while ((pizzasOrdered<10) && ((pizzaName != null) && (!pizzaName.isBlank())));

        int drinksCounter = 0;
        do {
            System.out.print("Add drink " + (drinksCounter + 1) + ", Enter blank when done: ");
            extraDrinks = input.nextLine().toLowerCase();
            isOK = ((extraDrinks == null) || (extraDrinks.isBlank()))
                    || (Drink.isDrinkValid(extraDrinks));
            if (!isOK) {
                System.out.println(extraDrinks + " is not an drink with have. Select another or press enter");
            } else {
                isOK = ((extraDrinks == null) || (extraDrinks.isBlank()))
                        || (Drink.isAgeValid(order.age, extraDrinks));
                if (!isOK) {
                    System.out.println(" you have to be at least 18 to order a beer. Select another or press enter");
                }
                else {
                    order.drinks.add(extraDrinks);
                    drinksCounter++;
                }
            }
        } while ((drinksCounter < 10) && ((extraDrinks != null) && (!extraDrinks.isBlank()))) ;
        return order;
    }
}
