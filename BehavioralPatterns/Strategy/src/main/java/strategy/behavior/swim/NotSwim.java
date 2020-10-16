package strategy.behavior.swim;

public class NotSwim implements SwimBehavior{
    public void swim() {
        System.out.println("Can't swim");
    }
}
