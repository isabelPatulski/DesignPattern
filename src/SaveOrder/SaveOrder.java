package SaveOrder;

import Pizza.FinishedOrder;

public class SaveOrder {
    public static void saveOrder (FinishedOrder finishedOrder) {
        System.out.println("Customer name: " + finishedOrder.customer.name + " Delegation: " + finishedOrder.delegation);
    }
}
