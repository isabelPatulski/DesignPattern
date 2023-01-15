package Product;

import java.util.ArrayList;
import java.util.List;

public class Drink extends Product{

    public Drink() {
        this.type = "Drink";
    }

    static List<String> getValidDrinks(){
        List<String> drinks = new ArrayList<>();
        drinks.add("water");
        drinks.add("soda");
        drinks.add("beer");

        return drinks;
    }

    public static boolean isDrinkValid (String drink){

        return Drink.getValidDrinks().contains(drink);
    }

    public static boolean isAgeValid (int age, String drink) {
        if ((drink.equals("beer")) && (age < 18)) {
            return false;
        }
        return true;
    }

    //Could be iceCubes/lemon etc.
    public void addIngredients(List<String> ingredientsList) {
    }

        public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Water extends Drink{
    public Water() {
        this.name = "Water";
        this.price = 1.0;
    }
}

class Soda extends Drink{
    public Soda() {
        this.name = "Soda" ;
        this.price = 2.0;

    }
}

class Beer extends Drink{
    public Beer() {
        this.name = "Beer";
        this.price = 3.0;

    }
}
