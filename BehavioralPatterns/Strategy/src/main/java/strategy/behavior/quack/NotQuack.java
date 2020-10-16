package strategy.behavior.quack;

public class NotQuack implements QuackBehavior{
    public void quack() {
        System.out.println("Can't quack");
    }
}
