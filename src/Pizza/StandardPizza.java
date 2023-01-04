package Pizza;
import Ingredient.*;

import java.util.ArrayList;
import java.util.List;

public abstract class StandardPizza extends Pizza{
    public abstract String name();
    public abstract double price();
    public abstract Ingredient ingredient();

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
        return StandardPizza.getValidPizzas().contains(name);
    }

}

    class Isabel extends StandardPizza {
    public double getCrustPrice() {
        return this.getCrustPrice();
    }

    @Override
    public String name() {
        return "Isabel";
    }

    @Override
    public double price() {
        return 10;
    }

    @Override
    public Ingredient ingredient() {
        IngredientFactory ingredientFactory = new IngredientFactory();
         return ingredientFactory.getIngredient("ham");
    }
}
