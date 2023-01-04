package Pizza;

public class CrustPizzaFactory {
    public Pizza getPizza(String pizzaType) {
        if (pizzaType == null) {
            return null;
        }
        switch (pizzaType.toLowerCase()) {
            case "original":
                return new DefaultCrustPizza();
            case "thin":
                return new ThinCrustPizza();
            case "sicilian":
                return new SicilianCrustPizza();
        }
        System.out.println("We dont have the selected crust");
        return null;
    }
}