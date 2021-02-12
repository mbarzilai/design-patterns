package factory.factorymethod.pizza;

public class NYStyleVeggiePizza extends NYStylePizza {
    public NYStyleVeggiePizza() {
        super("NY Style Veggie Pizza");

        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
