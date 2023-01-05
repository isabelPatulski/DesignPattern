package Pizza;

//To create the base for the Pizza i have used the Factory Design Pattern.
//TODO rename to crust
//TODO explain DesignPattern

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Product {
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
        return Pizza.getValidCrusts().contains(crust);
    }

    public static String defaultCrust () {
        return "Original";
    }
}

class DefaultCrustPizza extends Pizza{
    public DefaultCrustPizza() {
        crustPrice = 0;
        crustName = "Original";
        type  = "Pizza";
    }
}

class ThinCrustPizza extends Pizza {
    public ThinCrustPizza() {
        crustPrice = 0.5;
        crustName = "Thin";
        type = "Pizza";
    }
}

class SicilianCrustPizza extends Pizza {
    public SicilianCrustPizza() {
        crustPrice = 1;
        crustName = "Sicilian";
        type  = "Pizza";
    }
}



