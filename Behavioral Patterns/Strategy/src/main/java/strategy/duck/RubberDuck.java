package strategy.duck;

import strategy.behavior.fly.NotFly;
import strategy.behavior.quack.Squeak;
import strategy.behavior.swim.Swim;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new NotFly();
        quackBehavior = new Squeak();
        swimBehavior = new Swim();
    }
    public void display() {
        System.out.println("It's a rubber duck");
    }
}
