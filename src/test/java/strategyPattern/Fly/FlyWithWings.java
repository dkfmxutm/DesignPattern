package strategyPattern.Fly;

import strategyPattern.Fly.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("Fly With Wings.");
    }
}
