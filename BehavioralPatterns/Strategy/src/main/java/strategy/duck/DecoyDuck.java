package strategy.duck;

import strategy.behavior.fly.NotFly;
import strategy.behavior.quack.NotQuack;
import strategy.behavior.swim.NotSwim;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        flyBehavior = new NotFly();
        quackBehavior = new NotQuack();
        swimBehavior = new NotSwim();
    }

    public void display() {
        System.out.println("It's a decoy duck");
    }
}
