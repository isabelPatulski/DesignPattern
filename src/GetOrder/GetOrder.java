package GetOrder;
import Ingredient.Ingredient;
import Pizza.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//Limited errorHandling

public class GetOrder {
    public static Order getOrder(){
        System.out.println("PizziSalle pizzaria! Order your pizza here:");
        System.out.println("-------------------------------------------");
        Order order = new Order();
        Scanner input = new Scanner(System.in);

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

        order.delegation = "Barcelona";         //TODO replace with random

        System.out.println("What kind of pizzas would you like? Enter blank when done ordering Pizzas");
        int pizzasOrdered = 0;
        String pizzaName = "";
        String extraTopping = "";
        order.pizzas = new ArrayList<PizzaItem>();


        do {
            boolean isOK = false;
            do {
                System.out.print(("Enter pizza " + (pizzasOrdered + 1) + ": "));
                pizzaName = input.nextLine().toLowerCase();
                isOK = StandardPizza.isPizzaNameValid(pizzaName);
                if (!isOK) {
                    System.out.println(pizzaName + " is not a pizza with have. Try again");
                }
            } while ((!isOK) && ((pizzaName != null) && (!pizzaName.isBlank())));

            if ((pizzaName != null) && (!pizzaName.isBlank())) {
                PizzaItem pizzaItem = new PizzaItem();
                pizzaItem.name = pizzaName;
                do {
                    System.out.print("What kind of crust? Enter blank if you want Default ");
                    pizzaItem.crust = input.nextLine().toLowerCase();
                    isOK = ((pizzaItem.crust == null) || (pizzaItem.crust.isBlank()))
                            || (Pizza.isCrustValid(pizzaItem.crust));
                    if (!isOK) {
                        System.out.println(pizzaItem.crust + " is not a crust with have. Select another");
                    }
                } while (!isOK);

                if ((pizzaItem.crust == null) || (pizzaItem.crust.isBlank())) {
                    pizzaItem.crust = Pizza.defaultCrust();
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
                //Er denne en fejl? eller bare til test
                System.out.println(" "); //Creates an empty line between each pizza
                pizzasOrdered++;
            }

        } while ((pizzasOrdered<10) && ((pizzaName != null) && (!pizzaName.isBlank())));

        return order;
    }
}

//TODO order for beverages + isvalid in Drink class hvor du giver alder som int istedet for navn
