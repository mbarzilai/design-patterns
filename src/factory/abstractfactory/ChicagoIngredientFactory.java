package factory.abstractfactory;

import factory.abstractfactory.ingredients.BlackOlives;
import factory.abstractfactory.ingredients.Cheese;
import factory.abstractfactory.ingredients.Clams;
import factory.abstractfactory.ingredients.Dough;
import factory.abstractfactory.ingredients.Eggplant;
import factory.abstractfactory.ingredients.FrozenClams;
import factory.abstractfactory.ingredients.MozzarellaCheese;
import factory.abstractfactory.ingredients.Pepperoni;
import factory.abstractfactory.ingredients.PlumTomatoSauce;
import factory.abstractfactory.ingredients.Sauce;
import factory.abstractfactory.ingredients.SlicedPepperoni;
import factory.abstractfactory.ingredients.Spinach;
import factory.abstractfactory.ingredients.ThickCrustDough;
import factory.abstractfactory.ingredients.Veggies;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Spinach(), new BlackOlives(), new Eggplant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
