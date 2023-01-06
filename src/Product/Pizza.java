package Product;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Product{

    protected Crust crust;
    //TODO lav constructer der opretter en crust til pizza (crustName) og sæt type = pizza

    static List<String> getValidPizzas(){
        List<String> pizzas = new ArrayList<>();
        pizzas.add("diablo");
        pizzas.add("hawaiian");
        pizzas.add("margherita");
        pizzas.add("bacon Crispy");
        pizzas.add("american");
        pizzas.add("traviata");
        pizzas.add("burger");
        pizzas.add("castellera");
        pizzas.add("texas");
        pizzas.add("coast");
        pizzas.add("bbq");
        pizzas.add("carbonara");
        pizzas.add("4 cheeses");
        pizzas.add("pepperoni");
        pizzas.add("vegetal");
        pizzas.add("6 cheeses");
        pizzas.add("mallorca");
        pizzas.add("carbonara deluxe");

        return pizzas;
    }

    public static boolean isPizzaNameValid (String name){
        return Pizza.getValidPizzas().contains(name);

    }

}

class StandardPizzaBasic extends Pizza {

    public StandardPizzaBasic() {
        price = 3.0;
        name = "Basic";
    }
}

class Ingredient2Pizza extends Pizza {
    public Ingredient2Pizza() {
        price = 3.5;
        name = "2 Ingredients";
    }
}

class Ingredient3Pizza extends Pizza {
    public Ingredient3Pizza() {
        price = 4.0;
        name = "3 Ingredients";
    }
}

class Ingredient4Pizza extends Pizza {
    public Ingredient4Pizza() {
        price = 4.5;
        name = "4 Ingredients";
    }
}

class Ingredient5Pizza extends Pizza {
    public Ingredient5Pizza() {
        price = 5.0;
        name = "5 Ingredients";
    }
}

class Ingredient6Pizza extends Pizza {
    public Ingredient6Pizza() {
        price = 6.0;
        name = "6 Ingredients";
    }
}


