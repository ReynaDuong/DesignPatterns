package strategy.behavior.fly;

public class NotFly implements FlyBehavior{
    public void fly() {
        System.out.println("Can't fly");
    }
}
