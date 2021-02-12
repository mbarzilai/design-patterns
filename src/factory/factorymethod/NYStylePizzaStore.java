package factory.factorymethod;

import factory.factorymethod.pizza.NYStyleCheesePizza;
import factory.factorymethod.pizza.NYStyleClamPizza;
import factory.factorymethod.pizza.NYStylePepperoniPizza;
import factory.factorymethod.pizza.NYStyleVeggiePizza;
import factory.factorymethod.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
