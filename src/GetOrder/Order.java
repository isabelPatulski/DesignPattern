package GetOrder;


import Product.Drink;

import java.util.List;


public class Order {
    //No getter/setters
    public String name;
    public String phone;
    public String deliveryAddress;
    public Boolean firstOrder;
    public String delegation; //consider changing to enum
    public int age;

    public List<PizzaItem> pizzas;
    public List<String> drinks;



}

