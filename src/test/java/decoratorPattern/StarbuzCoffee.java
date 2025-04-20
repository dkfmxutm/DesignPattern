package decoratorPattern;

import decoratorPattern.Bevarage.Beverage;
import decoratorPattern.Bevarage.Expresso;
import decoratorPattern.Bevarage.HouseBlend;
import decoratorPattern.Condiment.Mocha;
import decoratorPattern.Condiment.Soy;
import decoratorPattern.Condiment.Whip;

public class StarbuzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
