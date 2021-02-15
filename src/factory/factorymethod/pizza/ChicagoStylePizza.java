package factory.factorymethod.pizza;

public abstract class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza(String name) {
        this.name = name;
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    // Even though only thin crust Chicago pizza is cut into squares!
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
