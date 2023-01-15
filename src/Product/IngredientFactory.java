package Product;

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
            case "sobrassada":
                return new Sobrassada();
            case "roquefort":
                return new Roquefort();
            case "carbonarasauce":
                return new CarbonaraSauce();
            case "cheddar":
                return new Cheddar();
            case "egg":
                return new Egg();
            case "bacon":
                return new Bacon();
            case "frankfurt":
                return new Frankfurt();
            case "sausage":
                return new Sausage();
            case "goatcheese":
                return new GoatCheese();
            case "honey":
                return new Honey();
            case "artichoke":
                return new Artichoke();
            case "bellpepper":
                return new BellPepper();
            case "prawns":
                return new Prawns();
            case "anchovies":
                return new Anchovies();
            case "tomatoslices":
                return new TomatoSlices();
            case "roquefortcheese":
                return new RoquefortCheese();
            case "bbqsauce":
                return new BBQSauce();
            case "olives":
                return new Olives();
            case "peperoni":
                return new Peperoni();
            case "onion":
                return new Onion();
            case "tuna":
                return new Tuna();
            case "brie":
                return new Brie();
            case "emmental":
                return new Emmental();
            case "mozzarella":
                return new Mozzarella();
            case "jamónserrano":
                return new JamónSerrano();

        }
        System.out.println("We dont have the selected ingredient");
        return null;
    }
}
