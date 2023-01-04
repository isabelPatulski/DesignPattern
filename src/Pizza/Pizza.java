package Pizza;

//To create the base for the Pizza i have used the Factory Design Pattern.
//TODO rename to crust
//TODO explain DesignPattern

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class Pizza {
    protected String name;
    protected double crustPrice;

    public abstract double getCrustPrice();

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
    @Override
    public double getCrustPrice() {
        return 0;
    }
}

class ThinCrustPizza extends Pizza {
    @Override
    public double getCrustPrice() {
        return 0.5;
    }
}

class SicilianCrustPizza extends Pizza {
    @Override
    public double getCrustPrice() {
        return 1;
    }
}



