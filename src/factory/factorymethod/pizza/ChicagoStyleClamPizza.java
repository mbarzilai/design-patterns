package factory.factorymethod.pizza;

public class ChicagoStyleClamPizza extends ChicagoStylePizza {
    public ChicagoStyleClamPizza() {
        super("Chicago Style Clam Pizza");

        toppings.add("Frozen Clams from Chesapeake Bay");
    }
}
