package factory.abstractfactory;

import factory.abstractfactory.NYPizzaIngredientFactory;
import factory.abstractfactory.PizzaIngredientFactory;
import factory.abstractfactory.PizzaStore;
import factory.abstractfactory.pizza.CheesePizza;
import factory.abstractfactory.pizza.ClamPizza;
import factory.abstractfactory.pizza.PepperoniPizza;
import factory.abstractfactory.pizza.Pizza;
import factory.abstractfactory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
