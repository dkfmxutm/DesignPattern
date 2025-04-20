import strategyPattern.Duck;
import strategyPattern.Fly.FlyWithWings;
import strategyPattern.Fly.Interface.FlyBehavior;
import strategyPattern.MallardDuck;
import strategyPattern.Quack.Interface.QuackBehavior;
import strategyPattern.Quack.Quack;

public class Main {
    public static void main(String[] args) throws Exception{

        FlyBehavior fb = new FlyWithWings();
        QuackBehavior qb = new Quack();

        fb.fly();
        qb.quack();

        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

    }
}
