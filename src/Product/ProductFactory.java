package Product;

public class ProductFactory {
    String name;
    Crust crust;

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