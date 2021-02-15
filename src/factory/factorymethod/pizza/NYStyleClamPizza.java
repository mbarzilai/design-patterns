package factory.factorymethod.pizza;

public class NYStyleClamPizza extends NYStylePizza {
    public NYStyleClamPizza() {
        super("NY Style Clam Pizza");

        toppings.add("Fresh Clams from Long Island Sound");
    }
}
