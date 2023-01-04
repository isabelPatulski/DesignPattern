package Pizza;


public class TestCrust {

    public static void main(String[] args){
        CrustPizzaFactory crustPizza = new CrustPizzaFactory();
        String input = "Original";
        Pizza pizza = crustPizza.getPizza(input);

        System.out.println("Price=" + pizza.getCrustPrice());
    }



}