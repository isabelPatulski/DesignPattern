package Product;

//PATTERN: Factory Design Pattern
// To create the base for the Pizza i have used the Factory Design Pattern. The Factory Design Pattern
//is a creational Design Pattern. You create an object without using the creation logic to the client
//and refer to newly created object using the common interface. In this case our interface is "product"
//Then i have created a productFactory that generates objects we need.

import java.util.List;

public abstract class Product {
    protected Double price;
    public String type;
    protected String name;

    public abstract Double getPrice();

    public abstract String getName();

    public abstract void addIngredients(List<String> ingredientsList);

    }


