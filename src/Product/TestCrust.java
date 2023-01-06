package Product;


public class TestCrust {

    public static void main(String[] args){
        CrustFactory crustPizza = new CrustFactory();
        String input = "Original";
        Crust crust = crustPizza.getCrust(input);

        System.out.println("Price=" + crust.crustPrice);
    }



}