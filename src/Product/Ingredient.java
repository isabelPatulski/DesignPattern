package Product;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    protected String name;
    protected double price;

    public double getPrice(){
        return 0;
    };

    static List<String> getValidIngredients(){
        List<String> ingredients = new ArrayList<>();
        ingredients.add("ham");
        ingredients.add("bacon");
        ingredients.add("chicken");
        ingredients.add("pinapple");
        ingredients.add("sobrassada");
        ingredients.add("roquefort");
        ingredients.add("carbonarasauce");
        ingredients.add("cheddar");
        ingredients.add("egg");
        ingredients.add("bacon");
        ingredients.add("frankfurt");
        ingredients.add("sausage");
        ingredients.add("roquefort");
        ingredients.add("sobrassada");
        ingredients.add("honey");
        ingredients.add("goatcheese");
        ingredients.add("artichoke");
        ingredients.add("bellpepper");
        ingredients.add("beef");
        ingredients.add("prawns");
        ingredients.add("anchovies");
        ingredients.add("tomatoslices");
        ingredients.add("roquefortcheese");
        ingredients.add("bbqsauce");
        ingredients.add("olives");
        ingredients.add("peperoni");
        ingredients.add("tuna");
        ingredients.add("onion");
        ingredients.add("brie");
        ingredients.add("emmental");
        ingredients.add("mozzarella");
        ingredients.add("mushrooms");
        ingredients.add("jamónserrano");



        return ingredients;
    }

    public static boolean isIngredientValid (String ingredient){
        if (ingredient == null || ingredient.isBlank()){
            return true;
        }
        return getValidIngredients().contains(ingredient);
    }

}


class Ham extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Pineapple extends Ingredient {
    @Override
    public double getPrice() {
        return 0.3;
    }
}

class Chicken extends Ingredient {
    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Sausage extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Frankfurt extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Bacon extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Egg extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Cheddar extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class CarbonaraSauce extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}


class Roquefort extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Sobrassada extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Honey extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class GoatCheese extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Artichoke extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class BellPepper extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}


class Beef extends Ingredient {

    @Override
    public double getPrice() {
        return 1.5;
    }
}

class Prawns extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Anchovies extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class TomatoSlices extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class RoquefortCheese extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class BBQSauce extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Olives extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Peperoni extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Tuna extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Onion extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class JamónSerrano extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Mushrooms extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Brie extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Emmental extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}

class Mozzarella extends Ingredient {

    @Override
    public double getPrice() {
        return 0.5;
    }
}


