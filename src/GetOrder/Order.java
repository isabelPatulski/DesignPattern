package GetOrder;


import java.util.List;


public class Order {
    //No getter/setters
    public String name;
    public String phone;
    public String deliveryAddress;
    public Boolean firstOrder;
    public String delegation; //consider changing to enum
    public int age;

    //TODO create addOns for each pizza (ingredients)
    public List<PizzaItem> pizzas;
    public List<String> beverages;



}

class PizzaItem {
    String name;
    String crust;
    List<String> toppings;
}
