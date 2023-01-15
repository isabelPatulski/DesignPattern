package Product;

public class ProductFactory {
    //PATTERN: Factory Design Pattern
// To create the base for the Pizza i have used the Factory Design Pattern. The Factory Design Pattern
//is a creational Design Pattern. You create an object without using the creation logic to the client
//and refer to newly created object using the common interface. In this case our interface is "product"
//Then i have created a productFactory that generates objects we need.

    public Product getProduct(String productName, String crustName) {
        if (productName == null) {
            return null;
        }
        switch (productName.toLowerCase()) {
            //Pizza
            case "margherita":
                return new StandardPizzaBasic(crustName);
            case "hawaiian":
                return new Ingredient2Pizza(crustName);
            case "bacon crispy", "american", "traviata":
                return new Ingredient3Pizza(crustName);
            case "burger", "cowboy", "texas", "coast", "bbq", "diablo", "carbonara", "spanish","4 cheeses", "pepperoni":
                return new Ingredient4Pizza(crustName);
            case "vegetal", "barcelona", "girona", "tarragona", "lleida":
                return new Ingredient5Pizza(crustName);
            case "6 cheeses", "mallorca", "carbonara deluxe":
                return new Ingredient6Pizza(crustName);
            //Drinks
            case "water":
                return new Water();
            case "soda":
                return new Soda();
            case "beer":
                return new Beer();
        }
        return null;
    }
}