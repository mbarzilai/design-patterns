package factory.abstractfactory;

import factory.abstractfactory.ingredients.Cheese;
import factory.abstractfactory.ingredients.Clams;
import factory.abstractfactory.ingredients.Dough;
import factory.abstractfactory.ingredients.FreshClams;
import factory.abstractfactory.ingredients.Garlic;
import factory.abstractfactory.ingredients.MarinaraSauce;
import factory.abstractfactory.ingredients.Mushroom;
import factory.abstractfactory.ingredients.Onion;
import factory.abstractfactory.ingredients.Pepperoni;
import factory.abstractfactory.ingredients.RedPepper;
import factory.abstractfactory.ingredients.ReggianoCheese;
import factory.abstractfactory.ingredients.Sauce;
import factory.abstractfactory.ingredients.SlicedPepperoni;
import factory.abstractfactory.ingredients.ThinCrustDough;
import factory.abstractfactory.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
       Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
       return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
