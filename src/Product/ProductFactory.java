package Product;

public class ProductFactory {
    String name;
    Crust crust;

    public Product getProduct(String product) {
        if (product == null) {
            return null;
        }
        switch (product.toLowerCase()) {
            case "margherita":
                return new StandardPizzaBasic();
            case "hawaiian":
                return new Ingredient2Pizza();
            case "bacon crispy", "american", "traviata":
                return new Ingredient3Pizza();
            case "burger", "cowboy", "texas", "coast", "bbq", "diablo", "carbonara", "spanish","4 cheeses", "pepperoni":
                return new Ingredient4Pizza();
            case "vegetal":
                return new Ingredient5Pizza();
            case "6 cheeses", "mallorca", "carbonara deluxe":
                return new Ingredient6Pizza();
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