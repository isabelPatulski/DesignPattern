package GetOrder;

//PATTERN: Facade Pattern
//Facade pattern is a structural DesignPattern. It helps the client to more easily interact with the program.
//In this class the getOrder() method chooses if we should use test data og input from the scanner.
//We then call the GetOrderFacade class in our main class "PizziSalle)
//You could also add more classes such as "mobileInput" or "websiteInput" and use the getOrderFacade as well.
//See line 14.
public class GetOrderFacade {
    public static Order getOrder(String type){
        switch (type.toLowerCase()) {
            case "test": return GetOrderTest.getOrder();
            case "input": return GetOrderInput.getOrder();
            //ex. case "mobile": return GetOrderMobile.getOrder();
        }

        return null;
    }
}
