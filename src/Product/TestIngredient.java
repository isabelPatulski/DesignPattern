package Product;

public class TestIngredient {
    public static void main(String[] args) {
            IngredientFactory ingredientFactory = new IngredientFactory ();
            String input = "Ham";
            Ingredient ingredient = ingredientFactory.getIngredient(input);

            System.out.println("Price=" + ingredient.getPrice());
            System.out.println("List of ingredients " + Ingredient.getValidIngredients().toString());
        }

}
