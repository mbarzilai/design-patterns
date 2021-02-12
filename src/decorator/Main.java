package decorator;

import decorator.beverages.DarkRoast;
import decorator.beverages.Expresso;
import decorator.beverages.HouseBlend;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;
import decorator.condiments.Whip;

public class Main {

    public static void main(String[] args) {
	    Beverage beverage1 = new Expresso();
	    printBeverage(beverage1);

	    Beverage beverage2 = new DarkRoast();
	    beverage2 = new Mocha(beverage2);
	    beverage2 = new Mocha(beverage2);
	    beverage2 = new Whip(beverage2);
	    printBeverage(beverage2);

	    Beverage beverage3 = new HouseBlend();
	    beverage3 = new Soy(beverage3);
	    beverage3 = new Mocha(beverage3);
	    beverage3 = new Whip(beverage3);
	    printBeverage(beverage3);
    }

    private static void printBeverage(Beverage beverage){
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
