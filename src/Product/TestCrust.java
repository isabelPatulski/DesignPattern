package Product;


public class TestCrust {

    public static void main(String[] args){
        CrustPizzaFactory crustPizza = new CrustPizzaFactory();
        String input = "Original";
        Crust crust = crustPizza.getPizza(input);

        System.out.println("Price=" + crust.crustPrice);
    }



}