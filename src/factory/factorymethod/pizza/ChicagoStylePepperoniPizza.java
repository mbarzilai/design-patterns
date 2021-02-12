package factory.factorymethod.pizza;

public class ChicagoStylePepperoniPizza extends ChicagoStylePizza {
    public ChicagoStylePepperoniPizza() {
        super("Chicago Style Pepperoni Pizza");

        toppings.add("Sliced Pepperoni");
    }
}
