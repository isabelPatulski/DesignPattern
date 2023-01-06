package Product;

public class CrustPizzaFactory {
    //TODO skal retunere et product (så den både kan retunere en drink og en pizza)
    public Crust getPizza(String pizzaType) {
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
               //TODO tilføj drink
        }
        System.out.println("We dont have the selected crust");
        return null;
    }
}