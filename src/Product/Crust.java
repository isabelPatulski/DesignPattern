package Product;

import java.util.ArrayList;
import java.util.List;

public class Crust extends Product {
    double crustPrice;
    String crustName;


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

    @Override
    public Double getPrice() {
        return null;
    }

    @Override
    public String getName() {
        return null;
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
        crustPrice = 0.75;
        crustName = "Sicilian";
        type  = "Product";
    }
}



