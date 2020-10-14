package strategy.duck;

import strategy.behavior.fly.FlyWithWings;
import strategy.behavior.quack.Quack;
import strategy.behavior.swim.Swim;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }

    public void display() {
        System.out.println("It's a redhead duck");
    }
}
