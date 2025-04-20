package decoratorPattern.Condiment;

import decoratorPattern.Bevarage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    
    public Beverage beverage;
    public abstract String getDescription(); 

}
