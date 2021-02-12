package factory.factorymethod;

import factory.factorymethod.pizza.ChicagoStyleCheesePizza;
import factory.factorymethod.pizza.ChicagoStyleVeggiePizza;
import factory.factorymethod.pizza.ChicagoStyleClamPizza;
import factory.factorymethod.pizza.ChicagoStylePepperoniPizza;
import factory.factorymethod.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
