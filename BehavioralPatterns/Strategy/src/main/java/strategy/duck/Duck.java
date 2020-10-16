package strategy.duck;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.quack.QuackBehavior;
import strategy.behavior.swim.SwimBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public void quack(){
        quackBehavior.quack();
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void swim(){
        swimBehavior.swim();
    }
    public abstract void display();
}
