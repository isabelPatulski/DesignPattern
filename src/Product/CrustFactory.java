package Product;

public class CrustFactory {
    public Crust getCrust(String crustType) {
        if ((crustType == null) || (crustType.isBlank())) {
            return null;
        }
        switch (crustType.toLowerCase()) {
            case "original", "":
                return new DefaultCrustPizza();
            case "thin":
                return new ThinCrustPizza();
            case "sicilian":
                return new SicilianCrustPizza();
        }
        return null;
    }
}