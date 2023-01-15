package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//TemplatePattern used
public class Pizza extends Product{

    protected Crust crust;
    protected List<Ingredient> ingredients;

    public Pizza(String crustName) {
        crust = new CrustFactory().getCrust(crustName);
        this.type = "Pizza";
        this.ingredients = new ArrayList<>();
    }

    public void addIngredients(List<String> ingredientsList){
        if (ingredientsList == null || ingredientsList.isEmpty()){
            return;
        }
        for (String ingredientString: ingredientsList) {
            Ingredient ingredient = new IngredientFactory().getIngredient(ingredientString);
            if (ingredient != null) {
                this.ingredients.add(ingredient);
            }
        }
    }

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
        pizzas.add("barcelona");
        pizzas.add("girona");
        pizzas.add("tarragona");
        pizzas.add("lleida");

        return pizzas;
    }

    public static boolean isPizzaNameValid (String name){
        if (name == null || name.isBlank()){
            return true;
        }
        return Pizza.getValidPizzas().contains(name);
    }

    public static String getRandomDelegation() {
        int delegationRandom = ThreadLocalRandom.current().nextInt(0, 4);
        switch (delegationRandom) {
            case 0:
                return  "barcelona";
            case 1:
                return  "girona";
            case 2:
                return  "tarragona";
            case 3:
                return  "lleida";
        }
        return "barcelona";
    }

    public static boolean isPizzaDelegationValid (String delegation, String pizzaName) {
        //Not pretty but it works

        boolean isOK = true;
        if ((delegation.equals("barcelona")) &&
                ((pizzaName.equals("tarragona")) || (pizzaName.equals("lleida")) || (pizzaName.equals("girona")))) {
            isOK = false;
        }
        if ((delegation.equals("tarragona")) &&
                ((pizzaName.equals("barcelona")) || (pizzaName.equals("lleida")) || (pizzaName.equals("girona")))) {
            isOK = false;
        }
        if ((delegation.equals("lleida")) &&
                ((pizzaName.equals("barcelona")) || (pizzaName.equals("tarragona")) || (pizzaName.equals("girona")))) {
            isOK = false;
        }
        if ((delegation.equals("girona")) &&
                ((pizzaName.equals("barcelona")) || (pizzaName.equals("tarragona")) || (pizzaName.equals("lleida")))) {
            isOK = false;
        }
        return isOK;
    }

        @Override
    public Double getPrice() {
        double totalPrice = this.price + crust.crustPrice;
        for (Ingredient ingredient:this.ingredients) {
            totalPrice+=ingredient.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class StandardPizzaBasic extends Pizza {

    public StandardPizzaBasic(String crust) {
        super(crust);
        price = 3.0;
        name = "Basic";
    }
}

class Ingredient2Pizza extends Pizza {
    public Ingredient2Pizza(String crust) {
        super(crust);
        price = 3.5;
        name = "2 Ingredients";
    }

}

class Ingredient3Pizza extends Pizza {
    public Ingredient3Pizza(String crust) {
        super(crust);
        price = 4.0;
        name = "3 Ingredients";
    }
}

class Ingredient4Pizza extends Pizza {
    public Ingredient4Pizza(String crust) {
        super(crust);
        price = 4.5;
        name = "4 Ingredients";
    }
}

class Ingredient5Pizza extends Pizza {
    public Ingredient5Pizza(String crust) {
        super(crust);
        price = 5.0;
        name = "5 Ingredients";
    }
}

class Ingredient6Pizza extends Pizza {
    public Ingredient6Pizza(String crust) {
        super(crust);
        price = 6.0;
        name = "6 Ingredients";
    }
}


