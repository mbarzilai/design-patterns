package factory.factorymethod.pizza;

public abstract class NYStylePizza extends Pizza {
    public NYStylePizza(String name) {
        this.name = name;
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
