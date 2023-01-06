package Product;

public class IngredientFactory {
    public Ingredient getIngredient(String ingredientType) {
        if (ingredientType == null) {
            return null;
        }
        switch (ingredientType.toLowerCase()) {
            case "ham":
                return new Ham();
            case "chicken":
                return new Chicken();
            case "pineapple":
                return new Pineapple();
        }
        System.out.println("We dont have the selected ingredient");
        return null;
    }
}