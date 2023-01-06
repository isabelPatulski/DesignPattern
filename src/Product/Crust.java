package Product;

//To create the base for the Pizza i have used the Factory Design Pattern.
//TODO explain DesignPattern

import java.util.ArrayList;
import java.util.List;

public class Crust extends Product {
    public double crustPrice;
    public String crustName;



    static List<String> getValidCrusts(){
        List<String> crusts = new ArrayList<>();
        crusts.add("thin");
        crusts.add("sicilian");
        crusts.add("original");

        return crusts;
    }

    public static boolean isCrustValid (String crust){
        return Crust.getValidCrusts().contains(crust);
    }

    public static String defaultCrust () {
        return "Original";
    }
}

class DefaultCrustPizza extends Crust{
    public DefaultCrustPizza() {
        crustPrice = 0;
        crustName = "Original";
        type  = "Product";
    }
}

class ThinCrustPizza extends Crust {
    public ThinCrustPizza() {
        crustPrice = 0.5;
        crustName = "Thin";
        type = "Product";
    }
}

class SicilianCrustPizza extends Crust {
    public SicilianCrustPizza() {
        crustPrice = 1;
        crustName = "Sicilian";
        type  = "Product";
    }
}



