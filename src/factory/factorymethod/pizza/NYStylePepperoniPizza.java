package factory.factorymethod.pizza;

public class NYStylePepperoniPizza extends NYStylePizza {
    public NYStylePepperoniPizza() {
        super("NY Style Pepperoni Pizza");

        toppings.add("Sliced Pepperoni");
    }
}
