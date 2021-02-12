package factory.factorymethod.pizza;

public class ChicagoStyleVeggiePizza extends ChicagoStylePizza {
    public ChicagoStyleVeggiePizza() {
        super("Chicago Deep Dish Veggie Pizza");

        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }
}
