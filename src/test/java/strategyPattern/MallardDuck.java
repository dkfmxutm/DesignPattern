package strategyPattern;

import strategyPattern.Fly.FlyWithWings;
import strategyPattern.Quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }



}
