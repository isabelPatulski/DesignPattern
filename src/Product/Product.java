package Product;

//PATTERN: Template Pattern
//The templatePattern creates a "skeleton" with functions for the subClasses to use.
//Here our "skeleton is the Product.Java class. It creates the "skeleton" we then use for the
//Drink.java class and for the Pizza.java class. In those classes we have then implemented the
//different functions from the Product.java class.

import java.util.List;

public abstract class Product {
    protected Double price;
    public String type;
    protected String name;

    public abstract Double getPrice();

    public abstract String getName();

    public abstract void addIngredients(List<String> ingredientsList);

    }


