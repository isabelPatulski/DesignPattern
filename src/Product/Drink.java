package Product;

import java.util.ArrayList;
import java.util.List;

public class Drink extends Product{
    public String drinkName;
    public double drinkPrice;

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

}

class Water extends Drink{
    public Water() {
        drinkName = "Water";
        drinkPrice = 1;
        //Skal den have product som cruts? eller burde crust have at den var product overhovedet
    }
}

class Soda extends Drink{
    public Soda() {
        drinkName = "Soda" ;
        drinkPrice = 2;

    }
}

class Beer extends Drink{
    public Beer() {
        drinkName = "Beer";
        drinkPrice = 3;

    }
}
