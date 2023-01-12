package Product;

//TODO fill out ingredients
public class IngredientFactory {
    public Ingredient getIngredient(String ingredientType) {
        if (ingredientType == null || ingredientType.isBlank()) {
            return null;
        }
        switch (ingredientType.toLowerCase()) {
            case "ham":
                return new Ham();
            case "chicken":
                return new Chicken();
            case "pineapple":
                return new Pineapple();
            case "beef":
                return new Beef();
            case "mushrooms":
                return new Mushrooms();
            case "tomatoslices":
                return new TomatoSlices();

        }
        System.out.println("We dont have the selected ingredient");
        return null;
    }
}
